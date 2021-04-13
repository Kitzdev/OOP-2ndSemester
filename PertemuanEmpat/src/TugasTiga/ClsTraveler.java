package OOP2ndSemester.PertemuanEmpat.src.TugasTiga;

public class ClsTraveler
{
    short travelerTransportaionChoice;  //Traveler transportation allowed
    boolean isTravelerMaskPass;         //Traveler Mask availability, TRUE if available
    boolean isTravelerGeNosePass;       //Traveler GeNose test value, TRUE if passed
    boolean isTravelerAntigenRapidPass; //Traveler RapidAntigen test value, TRUE if passed
    boolean isTravelerPCRPass;          //Traveler PCR test value, TRUE if passed

    /*
        travelerTransportationAvailable
            - travelerTransportationChoice 1 = Land Vehicle
            - travelerTransportationChoice 2 = Train
            - travelerTransportationChoice 3 = Ship
            - travelerTransportationChoice 4 = Plane
     */

    ClsTraveler(short travelerTransportaionChoice)
    {
        this.travelerTransportaionChoice = travelerTransportaionChoice;
    }

    //Traveler transportation available
    void CheckTransportationPass(short travelerTransportaionPass)
    {
        switch (travelerTransportaionPass)
        {
            case 1:
                System.out.println("You can go by Land Vechicle!");
                break;
            case 2:
                System.out.println("You can go by Train!");
                break;
            case 3:
                System.out.println("You can go by Ship!");
                break;
            case 4:
                System.out.println("You can go by Plane!");
                break;
            default:
                System.out.println("You can't go out today :(");
        }
    }

    void ChangeTravelerTestStatus(short travelerTestType, boolean testStatus)
    {
        switch (travelerTestType)
        {
            case 1:
                this.isTravelerMaskPass = testStatus;
                System.out.println("Mask Status has changed!");
                break;
            case 2:
                this.isTravelerGeNosePass = testStatus;
                System.out.println("GeNose test status has changed!");
                break;
            case 3:
                this.isTravelerAntigenRapidPass = testStatus;
                System.out.println("Antigen rapid test status has changed!");
                break;
            case 4:
                this.isTravelerPCRPass = testStatus;
                System.out.println("PCR test status has changed!");
                break;
        }
    }

    /*boolean checkTestValidity(String date)
    {

    }*/
}
