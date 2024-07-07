package seminars.second.hw;

import org.junit.jupiter.api.*;

//import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;
    @BeforeEach
    void setup() {
        car = new Car("Ford","Focus", 2022);
        motorcycle = new Motorcycle("Harley","Davidson",1998);
    }

    @DisplayName("Car является частью транспортного средства Vehicle")
    @Test
    void CarInstanceOfVehicle() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        // Assert (Проверка)
        assertInstanceOf(Vehicle.class, car);
    }

    @DisplayName("Motorcycle является частью транспортного средства Vehicle")
    @Test
    void MotorcycleInstanceOfVehicle() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        // Assert (Проверка)
        assertInstanceOf(Vehicle.class, motorcycle);
    }

    @DisplayName("Проверить, что объект Car создается с 4-мя колесами.")
    @Test
    void CarWheels() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        // Assert (Проверка)
        //assertThat(car.getNumWheels()).isEqualTo(4);
        assertEquals(4,car.getNumWheels());
    }

    @DisplayName("Проверить, что объект Motorcycle создается с 2-мя колесами.")
    @Test
    void MotorcycleWheels() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        // Assert (Проверка)
        //assertThat(car.getNumWheels()).isEqualTo(4);
        assertEquals(2,motorcycle.getNumWheels());
    }

    @DisplayName("Проверить, что объект Car развивает скорость 60 в режиме тестового вождения")
    @Test
    void CarTestDrive() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        // Assert (Проверка)
        //assertThat(car.getNumWheels()).isEqualTo(4);
        car.testDrive();
        assertEquals(60,car.getSpeed());
    }

    @DisplayName("Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения")
    @Test
    void MotorcycleTestDrive() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        // Assert (Проверка)
        //assertThat(car.getNumWheels()).isEqualTo(4);
        motorcycle.testDrive();
        assertEquals(75,motorcycle.getSpeed());
    }

    @DisplayName("Проверить, что в режиме парковки машина останавливается")
    @Test
    void CarParkSpeed() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        // Assert (Проверка)
        //assertThat(car.getNumWheels()).isEqualTo(4);
        car.testDrive();
        car.park();
        assertEquals(0,car.getSpeed());
    }

    @DisplayName("Проверить, что в режиме парковки мотоцикл останавливается")
    @Test
    void MotorcycleParkSpeed() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        // Assert (Проверка)
        //assertThat(car.getNumWheels()).isEqualTo(4);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0,motorcycle.getSpeed());
    }
}
