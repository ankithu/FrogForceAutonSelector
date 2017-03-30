/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ankith
 */
public class SelectorState {
	public static  boolean readyToSend;
   
    private static PEG_OPTIONS pegOption;
    private static ALLIANCE_OPTIONS allianceOption;
    private static HOPPER_OPTIONS hopperOption;
    private static DO_NOTHING_OPTIONS doNothingOption;
    private static SHOOTING_OPTIONS shootingOption;
    
    public enum PEG_OPTIONS{
        LEFT_PEG, RIGHT_PEG, CENTER_PEG, NO_PEG
    };
    public enum ALLIANCE_OPTIONS{
        RED_ALLIANCE, BLUE_ALLIANCE
    };
    public enum HOPPER_OPTIONS{
      YES, NO  
    };
    public enum DO_NOTHING_OPTIONS{
        YES, NO
    };
    public enum SHOOTING_OPTIONS{
        YES, NO
    };
    
    public static void setPegOption(PEG_OPTIONS option){
        pegOption = option;
    }
    public static PEG_OPTIONS getPegOption(){
        return pegOption;
    }
    
    public static void setShootingOption(SHOOTING_OPTIONS option){
        shootingOption = option;
    }
    public static SHOOTING_OPTIONS getShootingOption(){
        return shootingOption;
    }
    
    public static void setDoNothingOption(DO_NOTHING_OPTIONS option){
        doNothingOption = option;
    }
    public static DO_NOTHING_OPTIONS getDoNothingOption(){
        return doNothingOption;
    }
    
    public static void setHopperOption(HOPPER_OPTIONS option){
       hopperOption = option;
    }
    public static HOPPER_OPTIONS getHopperOption(){
        return hopperOption;
    }
    
    public static void setAllianceOption(ALLIANCE_OPTIONS option){
        allianceOption = option;
    }
    public static ALLIANCE_OPTIONS getAllianceOption(){
        return allianceOption;
    }
        
}
