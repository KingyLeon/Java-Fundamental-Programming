package Question_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class HouseTest {

    @Test
    public void testGetAvailableRooms() {
	House house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
	assertEquals(2, house.getAvailableRooms());
    }

    @Test
    public void testGetPrice() {
	House house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
	Room r = new Room(500);
	Room r2 = new Room(500);

	ITenant t = new Tenant("f","s", 19, TenantType.PROFESSIONAL);
	ITenant t2 = new Tenant("f","s", 19, TenantType.PROFESSIONAL);
	house.occupy(r, t);
	house.occupy(r2, t2);
	assertEquals(1000, house.getPrice(), 0);
    }

    @Test
    public void testHouse() {
	House house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
	assertEquals("1 Percy Road, Guildford GU2 7XH (2 bedroom house :2 available)", house.toString());

    }

    @Test
    public void testIsAvailable() {
	House house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
	assertTrue(house.isAvailable());
    }

    @Test
    public void testOccupyRoom() {
	Room room1 = new Room(900);

	Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);

	House house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);

	house.occupy(room1, tenant1);
	assertEquals(1, house.getAvailableRooms());

    }

    @Test
    public void testInvalidCityOrPostCode() {
	try {
	    House house = new House(1, "Percy Road", "guiLDford", "ABC", 2);
	    fail("Expected IllegalArgumentException not thrown");
	} catch (IllegalArgumentException e) {

	}

    }

}
