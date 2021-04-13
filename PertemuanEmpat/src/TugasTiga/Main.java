package OOP2ndSemester.PertemuanEmpat.src.TugasTiga;

import java.util.Scanner;

//Note: This program was made in 22 February 2021, I can't be sure this program will be valid for the next day.

public class Main
{
    public static void main(String[] args)
    {
        //SCANNER DECLARATION
        Scanner scanner = new Scanner(System.in);

        short travelerTransportaionChoice = 0;    //Save traveler transportation choice's
        short travelerChangeStatus;             //Save traveler change status choice's
        boolean checkInput;                     //Check if input valid or not
        boolean changeStatus = false;           //Save traveler answer about change status
        String travelerAnswer;                  //Save traveler answer
        
        //PROGRAM
        System.out.println(" Let's check if you can go or not! ");

        //Traveler age input process
        do
        {
            checkInput = false;
            System.out.print("Enter your age: ");

            //Check if traveler input was an integer or not
            if(scanner.hasNextShort())
            {
                checkInput = true;
            }

        } while(!checkInput);

        //Traveler transportation choice's process
        do
        {
            checkInput = false;
            System.out.println();
            System.out.println("=============================");
            System.out.println("   Transportation Choice's");
            System.out.println("Train        = 1");
            System.out.println("Plane        = 2");
            System.out.println("Ship         = 3");
            System.out.println("Land Vehicle = 4");
            System.out.print("Enter your transportaion choice's: ");
            
            //Check if traveler input was an integer or not
            if(scanner.hasNextShort())
            {
                travelerTransportaionChoice = scanner.nextShort();

                if(travelerTransportaionChoice <= 4)
                {
                    checkInput = true;

                } else
                {
                    System.out.println("Your input must between 1 to 4 (1 and 4 included)");
                }

            } else
            {
                System.out.println("Your input must be an integer!");
            }
            
        }while(!checkInput);
        scanner.nextLine();
        
        ClsTraveler objTraveler = new ClsTraveler(travelerTransportaionChoice);

        System.out.println("=============================");
        System.out.println("       Check Status");
        System.out.println("Note : Please enter " + "yes" + " or " + "no");

        //Traveler mask status
        do
        {
            checkInput = false;
            System.out.print("Do you wear your mask?: ");

            if(scanner.hasNextLine())
            {
                travelerAnswer = scanner.nextLine();
                travelerAnswer = travelerAnswer.toUpperCase();

                if(travelerAnswer == "YES")
                {
                    objTraveler.isTravelerMaskPass = true;
                    checkInput = true;

                } else if(travelerAnswer == "NO")
                {
                    objTraveler.isTravelerMaskPass = false;
                    checkInput = true;

                } else
                {
                    System.out.println("Answer must be " + "yes" + "or" + "no");
                }

            } else
            {
                System.out.println("Answer must be " + "yes" + "or" + "no");
            }

        } while(!checkInput);

        //Traveler GeNose test status
        if(objTraveler.travelerTransportaionChoice == 2) {
            do {
                checkInput = false;
                System.out.print("Is your GeNose test result is negative?: ");

                if (scanner.hasNextLine())
                {
                    travelerAnswer = scanner.nextLine();
                    travelerAnswer = travelerAnswer.toUpperCase();

                    if (travelerAnswer == "YES")
                    {
                        objTraveler.isTravelerMaskPass = true;
                        checkInput = true;

                    } else if (travelerAnswer == "NO")
                    {
                        objTraveler.isTravelerMaskPass = false;
                        checkInput = true;

                    } else {
                        System.out.println("Answer must be " + "yes" + "or" + "no");
                    }

                } else {
                    System.out.println("Answer must be " + "yes" + "or" + "no");
                }

            } while (!checkInput);
        }

        //Date of antigen rapid test or PCR test
        //Year of test
        if(objTraveler.travelerTransportaionChoice == 3 || objTraveler.travelerTransportaionChoice == 4) {
            do {
                checkInput = false;
                System.out.print("Enter year of test: ");

                //Check if traveler input was an integer or not
                if (scanner.hasNextInt()) {
                    checkInput = true;
                }

            } while (!checkInput);

            //Month of test
            do {
                checkInput = false;
                System.out.print("Enter month of test: ");

                //Check if traveler input was an integer or not
                if (scanner.hasNextInt()) {
                    checkInput = true;
                }

            } while (!checkInput);

            //Day of test
            do {
                checkInput = false;
                System.out.print("Enter day of test: ");

                //Check if traveler input was an integer or not
                if (scanner.hasNextInt()) {
                    checkInput = true;
                }

            } while (!checkInput);
        }

        //Traveler antigen rapid test status
        if(objTraveler.travelerTransportaionChoice == 3 || objTraveler.travelerTransportaionChoice == 4)
        {
            do {
                checkInput = false;
                System.out.print("Is your antigen rapid test result is negative?: ");

                if (scanner.hasNextLine()) {
                    travelerAnswer = scanner.nextLine();
                    travelerAnswer = travelerAnswer.toUpperCase();

                    if (travelerAnswer == "YES") {
                        objTraveler.isTravelerMaskPass = true;
                        checkInput = true;

                    } else if (travelerAnswer == "NO") {
                        objTraveler.isTravelerMaskPass = false;
                        checkInput = true;

                    } else {
                        System.out.println("Answer must be " + "yes" + "or" + "no");
                    }

                } else {
                    System.out.println("Answer must be " + "yes" + "or" + "no");
                }

            } while (!checkInput);
        }

        //Traveler PCR test status
        if(objTraveler.travelerTransportaionChoice == 3 || objTraveler.travelerTransportaionChoice == 4)
        {
            do {
                checkInput = false;
                System.out.print("Is your PCR test result is negative?: ");

                if (scanner.hasNextLine()) {
                    travelerAnswer = scanner.nextLine();
                    travelerAnswer = travelerAnswer.toUpperCase();

                    if (travelerAnswer == "YES") {
                        objTraveler.isTravelerMaskPass = true;
                        checkInput = true;

                    } else if (travelerAnswer == "NO") {
                        objTraveler.isTravelerMaskPass = false;
                        checkInput = true;

                    } else {
                        System.out.println("Answer must be " + "yes" + "or" + "no");
                    }

                } else {
                    System.out.println("Answer must be " + "yes" + "or" + "no");
                }

            } while (!checkInput);
        }

        //Display traveler test status and let traveler change test status if there is a mistake
        System.out.print("Your mask status: ");
        if(objTraveler.isTravelerMaskPass)
        {
            System.out.println("yes");
        }

        if(objTraveler.travelerTransportaionChoice == 2)
        {
            System.out.print("Your mask status: ");
            if (objTraveler.isTravelerGeNosePass) {
                System.out.println("yes");
            }
        }

        if(objTraveler.travelerTransportaionChoice == 3 || objTraveler.travelerTransportaionChoice == 4)
        {
            System.out.print("Your mask status: ");
            if (objTraveler.isTravelerAntigenRapidPass) {
                System.out.println("yes");
            }
        }

        if(objTraveler.travelerTransportaionChoice == 3 || objTraveler.travelerTransportaionChoice == 4)
        {
            System.out.print("Your mask status: ");
            if (objTraveler.isTravelerMaskPass) {
                System.out.println("yes");
            }
        }

        //Check if traveler want to change test status or not
        do
        {
            checkInput = false;
            System.out.println("Do you want to change your status?");
            System.out.print("(Answer with " + "yes" + "or" + "no : ");
            travelerAnswer = scanner.nextLine();
            travelerAnswer = travelerAnswer.toUpperCase();

            if (travelerAnswer == "YES")
            {
                do
                {
                    checkInput = false;
                    System.out.println();
                    System.out.println("=============================");
                    System.out.println("   Change Test Choice's");
                    System.out.println("Mask Staus         = 1");
                    System.out.println("GeNose Test        = 2");
                    System.out.println("Antigen Rapid Test = 3");
                    System.out.println("PCR test           = 4");
                    System.out.print("Enter your change test choice's: ");

                    //Check if traveler input was an integer or not
                    if(scanner.hasNextShort())
                    {
                        travelerChangeStatus = scanner.nextShort();

                        if(travelerChangeStatus <= 4)
                        {
                            System.out.print("Enter new status for the test " + "yes" + "or" + "no : ");

                            if(scanner.hasNextLine())
                            {
                                travelerAnswer = scanner.nextLine();
                                travelerAnswer = travelerAnswer.toUpperCase();

                                if(travelerAnswer == "YES")
                                {
                                    changeStatus = true;

                                } else if(travelerAnswer == "NO")
                                {
                                    changeStatus = false;

                                } else
                                {
                                    System.out.println("Answer must be " + "yes" + "or" + "no");
                                }
                            } else
                            {
                                System.out.println("Answer must be " + "yes" + "or" + "no");
                            }

                            objTraveler.ChangeTravelerTestStatus(travelerChangeStatus, changeStatus);

                        } else
                        {
                            System.out.println("Your input must between 1 to 4 (1 and 4 included)");
                        }

                    } else
                    {
                        System.out.println("Your input must be an integer!");
                    }

                } while(!checkInput);

            } else if (travelerAnswer == "NO")
            {
                checkInput = true;

            } else {

                System.out.println("Answer must be " + "yes" + "or" + "no");
            }

        } while(!checkInput);

        //Decide if traveler can go or not
        if(objTraveler.isTravelerMaskPass)
        {
            if(objTraveler.travelerTransportaionChoice == 1)
            {
                if(objTraveler.isTravelerGeNosePass)
                {
                    objTraveler.CheckTransportationPass((short)1);
                }

            } else if(objTraveler.travelerTransportaionChoice == 3 || objTraveler.travelerTransportaionChoice == 4)
            {
                if(objTraveler.travelerTransportaionChoice == 3)
                {
                    if(objTraveler.isTravelerAntigenRapidPass)
                    {
                        objTraveler.CheckTransportationPass((short)2);
                    }
                } else
                {
                    if(objTraveler.isTravelerAntigenRapidPass && objTraveler.isTravelerPCRPass)
                    {
                        objTraveler.CheckTransportationPass((short)4);
                    }
                }
            } else
            {
                objTraveler.CheckTransportationPass((short)5);
            }

        } else
        {
            objTraveler.CheckTransportationPass((short) 5);
        }

        scanner.close();
    }
}
