package youtubeCourse;

public abstract class BaseCreditManager implements ICreditManager {
	public abstract void calculate();// tamamlanmamış

	public void save() {// tamamlanmış
		System.out.println("Kaydedildi");
	}
}
