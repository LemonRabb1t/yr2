/**
 * A Resistor models an ideal resistor that obeys Ohm's Law.
 *
 * @author Pei Xian Yang
 */
package coe318.lab1;

public class resistor {
    private double ResistValue;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ``                                                                                                                                                                                                                                                                                                                                                                                                                     
    private double VoltValue;
    private double CurrentValue;
//Instance (state) variables
//TODO Add instance variables (Hint: you only need 2!)

    /**
     * Create an ideal Resistor. The initial current through and voltage across
     * the Resistor are zero.
     *
     * @param resistance resistance in Ohms
     */
    public resistor(double resistance) {
       ResistValue = resistance;
//Set values of state variables
    }

    /**
     * Returns the value of the resistor in Ohms.
     *
     * @return the resistance
     */
    public double getResistance() {
//FIX THIS so that it returns the actual resistance        
        return ResistValue;
    }

    /**
     * Returns the voltage across the resistor.
     *
     * @return the voltage
     */
    public double getVoltage() {
//FIX THIS so that it returns the actual voltage
        if (CurrentValue > 0){
            VoltValue = CurrentValue * ResistValue;   
        }
        return VoltValue;
    }

    /**
     * Sets the value of the voltage across the resistor.
     *
     * @param voltage the voltage to set
     */
    public void setVoltage(double voltage) {
//FIX THIS. Only set the voltage value if the parameter
//is between 50 and -50, otherwise print an error message.
       if (voltage >= -50 && voltage <= 50){
           VoltValue = voltage;
       }else{
           System.out.println("Error: Voltage Value beyond limit");
       }
    }

    /**
     * Returns the current through the Resistor.
     *
     * @return the current
     */
    public double getCurrent() {
//FIX THIS
        if (VoltValue > 0){
            CurrentValue = VoltValue/ResistValue;  
        }
        return CurrentValue;
    }

    /**
     * Sets the value of the current through the resistor.
     *
     * @param current the current to set
     */
    public void setCurrent(double current) {
//FIX THIS.Only set the current value if the parameter
//is between 5 and -5, otherwise print an error message.
      if (current >= -5 && current <= 5){
          CurrentValue = current;
      } else{
          System.out.println("Error: Current Value beyond limit");
      }
    }

    /**
     * Returns the power (in Watts) dissipated by the Resistor.
     *
     * @return the power
     */
    public double getPower() {
//FIX THIS
        double PowerValue = VoltValue * CurrentValue;
        return PowerValue;
    }

    /**
     * A simple example of using a Resistor.
     * <p>
     * The output should be:
     * <pre>
     * Creating a 50 Ohm resistor (r1)
     * Its resistance is 50.0 Ohms
     * Its current is 0.0 Amps
     * Its voltage is 0.0 Volts
     * * Its power is 0.0 Watts
     * Creating a 100 Ohm resistor (r2)
     * Its resistance is 100.0 Ohms
     * Setting r1's current to 10 Amps
     * Error: current value beyond limit
     * Setting r1's current to 2 Amps
     * Its current is 2.0 Amps
     * Its voltage is 100.0 Volts
     * Its power is 200.0 Watts
     * Setting r1's voltage to 90 Volts
     * Error: voltage value beyond limit
     * Setting r1's voltage to 50 Volts
     * Its current is 1.0 Amps
     * Setting r2's current to 3 Amps
     * Its voltage is 300.0 Volts
     * </pre>
     *
     * @param args (Command line arguments not used.)
     */
    public static void main(String[] args) {
        resistor r1, r2;
        System.out.println("Creating a 50 Ohm resistor (r1)");
        r1 = new resistor(120.0);
        
        System.out.println("Its resistance is "
                + r1.getResistance() + " Ohms");
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        
        System.out.println("\nCreating a 120 Ohm resistor (r2)");
        r2 = new resistor(120.0);
        System.out.println("Its resistance is "
                + r2.getResistance() + " Ohms");
        
        System.out.println("\nSetting r1's current to 6.5 Amps");
        r1.setCurrent(6.5);
        System.out.println("\nSetting r1's current to 2 Amps");
        r1.setCurrent(2);
        
        
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Setting r1's voltage to 90 Volts");
        r1.setVoltage(90.0);
        System.out.println("Setting r1's voltage to 50 Volts");
        r1.setVoltage(50.0);
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Setting r2's current to 3 Amps");
        r2.setCurrent(0.5);
        System.out.println("Its voltage is "
                + r2.getVoltage() + " Volts");
    }
}