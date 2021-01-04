package fr.bobsonic.overidle.dev;

import java.util.UUID;
import fr.bobsonic.overidle.Reference;

public class DevMain {
    public DevMain() {

    }

    public void debug(String file, String msg) {
        	 System.out.println(ConsoleColors.RED + "[Over-Idle]" + ConsoleColors.PURPLE + "[Debug]" + ConsoleColors.BLUE + file + ConsoleColors.GREEN + " - " + msg + ConsoleColors.RESET);
    }

	public void debug(String file, UUID uuid) {
		System.out.println(ConsoleColors.GREEN + "[Over-Idle]" + ConsoleColors.BLUE + "" + ConsoleColors.RESET);		
	}

	public void debug(String string) {
		
	}

}
