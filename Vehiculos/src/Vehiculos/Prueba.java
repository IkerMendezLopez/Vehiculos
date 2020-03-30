package Vehiculos;

public class Prueba {
public static void main(String[] args) {
	Vehiculo v1 = new Vehiculo("ROJO");
	Camion c1 = new Camion((byte) 6);
	Motocicleta m1 = new Motocicleta("Azul", (byte)125);
	v1.ver();
	c1.ver();
	m1.ver();
}
}

