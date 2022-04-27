package j16_스태틱.loopController;

public class FlagController {
	public static boolean flag = true;
	
	public static void changeFlag() {
		if(Main.flag == true) {
			Main.flag = false;
		}else {
			Main.flag = true;
		}
	}
}
