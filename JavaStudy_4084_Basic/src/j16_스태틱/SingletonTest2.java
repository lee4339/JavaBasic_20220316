package j16_스태틱;

public class SingletonTest2 {
	public void temp() {
		KIA factory = KIA.getInstance();
		
		System.out.println(factory.createCar("k8").toString());
	}
}
