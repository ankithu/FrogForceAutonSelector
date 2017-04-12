import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class NetworkTablesSpitter {
	static NetworkTable table;
	public NetworkTablesSpitter(){
		NetworkTable.setClientMode();
		NetworkTable.setIPAddress("roboRIO-502-FRC.local");
		table = NetworkTable.getTable("AutonChoices");
	}
	public void spitData(){
		if (SelectorState.getShootingOption().equals(SelectorState.SHOOTING_OPTIONS.NO)){
			table.putBoolean("shoot", false);
		}
		else{
			table.putBoolean("shoot", true);
		}
		
		
		if (SelectorState.getAllianceOption().equals(SelectorState.ALLIANCE_OPTIONS.BLUE_ALLIANCE)){
			table.putString("alliance", "blue");
		}
		else{
			table.putString("alliance", "red");
		}
		
		
		if (SelectorState.getPegOption().equals(SelectorState.PEG_OPTIONS.LEFT_PEG)){
			table.putString("peg", "left");
		}
		else if (SelectorState.getPegOption().equals(SelectorState.PEG_OPTIONS.RIGHT_PEG)){
			table.putString("peg", "right");
		}
		else if (SelectorState.getPegOption().equals(SelectorState.PEG_OPTIONS.CENTER_PEG)){
			table.putString("peg", "center");
		}
		else if (SelectorState.getPegOption().equals(SelectorState.PEG_OPTIONS.NO_PEG)){
			table.putString("peg", "none");
		}
		
		
		
		if (SelectorState.getDoNothingOption().equals(SelectorState.DO_NOTHING_OPTIONS.NO)){
			table.putBoolean("doNothing", false);
		}
		else{
			table.putBoolean("doNothing", true);
		}
		
		
		if (SelectorState.getHopperOption().equals(SelectorState.HOPPER_OPTIONS.NO)){
			table.putBoolean("hopper", false);
		}
		else{
			table.putBoolean("hopper", true);
		}
		SelectorState.readyToSend = false;
		
	}
}
