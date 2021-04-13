package OOP2ndSemester.PertemuanEmpat.src.TugasTiga;

import java.util.Scanner;

public class AnotherMain
{
    public static void main(String[] args)
    {
        //SCANNER DECLARATION
        Scanner scanner = new Scanner(System.in);

        //DECLARE VARIABLE
        short travelerTransportationChoice = 0; //Save traveler transportation choice's
        short travelerChangeStatus;             //Save traveler change status choice's
        boolean checkInput;                     //Check if input valid or not
        String travelerAnswer;                  //Save traveler answer

        //PROGRAM
        System.out.println(" Let's check if you can go or not! ");

        //Traveler transportation choice's process
        do
        {
            checkInput = false;
            System.out.println();
            System.out.println("=============================");
            System.out.println("   Transportation Choice's");
            System.out.println("Land Vehicle = 1");
            System.out.println("Train        = 2");
            System.out.println("Ship         = 3");
            System.out.println("Plane        = 4");
            System.out.print("Enter your transportation choice's: ");

            //Check if traveler input was an integer or not
            if(scanner.hasNextShort())
            {
                travelerTransportationChoice = scanner.nextShort();

                if(travelerTransportationChoice <= 4)
                {
                    checkInput = true;

                } else
                {
                    System.out.println("Your input must between 1 to 4 (1 and 4 included)");
                }

            } else
            {
                System.out.println("Your input must be an integer!");
                scanner.nextLine();
            }

        }while(!checkInput);
        scanner.nextLine();

        ClsTraveler objTraveler = new ClsTraveler(travelerTransportationChoice);

        System.out.println();
        System.out.println("=============================");
        System.out.println("       Check Status");
        System.out.println("Note : Please enter " + "yes" + " or " + "no");
        System.out.println();

        //Traveler mask status
        do
        {
            checkInput = false;
            System.out.print("Do you wear your mask?: ");

            if(scanner.hasNextLine())
            {
                travelerAnswer = scanner.nextLine();
                travelerAnswer = travelerAnswer.toUpperCase();

                if(travelerAnswer.equals("YES"))
                {
                    objTraveler.isTravelerMaskPass = true;
                    checkInput = true;

                } else if(travelerAnswer.equals("NO"))
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
                System.out.print("Is your GeNose test result negative?: ");

                if (scanner.hasNextLine())
                {
                    travelerAnswer = scanner.nextLine();
                    travelerAnswer = travelerAnswer.toUpperCase();

                    if (travelerAnswer.equals("YES"))
                    {
                        objTraveler.isTravelerGeNosePass = true;
                        checkInput = true;

                    } else if (travelerAnswer.equals("NO"))
                    {
                        objTraveler.isTravelerGeNosePass = false;
                        checkInput = true;

                    } else {
                        System.out.println("Answer must be " + "yes" + "or" + "no");
                    }

                } else {
                    System.out.println("Answer must be " + "yes" + "or" + "no");
                }

            } while (!checkInput);
        }

        //Traveler antigen rapid test status
        if(objTraveler.travelerTransportaionChoice == 3 || objTraveler.travelerTransportaionChoice == 4)
        {
            do {
                checkInput = false;
                System.out.print("Is your antigen rapid test result negative?: ");

                if (scanner.hasNextLine()) {
                    travelerAnswer = scanner.nextLine();
                    travelerAnswer = travelerAnswer.toUpperCase();

                    if (travelerAnswer.equals("YES")) {
                        objTraveler.isTravelerAntigenRapidPass = true;
                        checkInput = true;

                    } else if (travelerAnswer.equals("NO")) {
                        objTraveler.isTravelerAntigenRapidPass = false;
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
        if(objTraveler.travelerTransportaionChoice == 4)
        {
            do {
                checkInput = false;
                System.out.print("Is your PCR test result negative?: ");

                if (scanner.hasNextLine()) {
                    travelerAnswer = scanner.nextLine();
                    travelerAnswer = travelerAnswer.toUpperCase();

                    if (travelerAnswer.equals("YES")) {
                        objTraveler.isTravelerPCRPass = true;
                        checkInput = true;

                    } else if (travelerAnswer.equals("NO")) {
                        objTraveler.isTravelerPCRPass = false;
                        checkInput = true;

                    } else {
                        System.out.println("Answer must be " + "yes" + "or" + "no");
                    }

                } else {
                    System.out.println("Answer must be " + "yes" + "or" + "no");
                }

            } while (!checkInput);
        }
        System.out.println();

        //Display traveler test status and let traveler change test status if there is a mistake
        System.out.print("Your mask status: ");
        if(objTraveler.isTravelerMaskPass)
        {
            System.out.println("yes");

        }else
        {
            System.out.println("no");
        }

        if(objTraveler.travelerTransportaionChoice == 2)
        {
            System.out.print("Your GeNose test status: ");

            if (objTraveler.isTravelerGeNosePass)
            {
                System.out.println("yes");

            } else
            {
                System.out.println("no");
            }
        }

        if(objTraveler.travelerTransportaionChoice == 3 || objTraveler.travelerTransportaionChoice == 4)
        {
            System.out.print("Your antigen rapid test status: ");

            if (objTraveler.isTravelerAntigenRapidPass)
            {
                System.out.println("yes");

            } else
            {
                System.out.println("no");
            }
        }

        if(objTraveler.travelerTransportaionChoice == 4)
        {
            System.out.print("Your PCR test status: ");

            if (objTraveler.isTravelerMaskPass)
            {
                System.out.println("yes");

            } else
            {
                System.out.println("no");
            }
        }

        //Check if traveler want to change test status or not
        do
        {
            checkInput = false;
            System.out.println();
            System.out.println("Do you want to change your test status?");
            System.out.print("(Answer with " + "yes" + " or " + "no) : ");
            travelerAnswer = scanner.nextLine();
            travelerAnswer = travelerAnswer.toUpperCase();

            if (travelerAnswer.equals("YES"))
            {
                do
                {
                    System.out.println();
                    System.out.println("=============================");
                    System.out.println("   Change Test Choice's");
                    System.out.println("Mask Status        = 1");
                    System.out.println("GeNose Test        = 2");
                    System.out.println("Antigen Rapid Test = 3");
                    System.out.println("PCR test           = 4");
                    System.out.print("Enter your change test choice's: ");

                    //Check if traveler input was an integer or not
                    if(scanner.hasNextShort())
                    {
                        travelerChangeStatus = scanner.nextShort();
                        scanner.nextLine();

                        if(travelerChangeStatus <= 4)
                        {
                            System.out.print("Enter new status for the test! (" + "yes" + " or " + "no) : ");

                            if(scanner.hasNextLine())
                            {
                                travelerAnswer = scanner.nextLine();
                                travelerAnswer = travelerAnswer.toUpperCase();

                                if(travelerAnswer.equals("YES"))
                                {
                                    objTraveler.ChangeTravelerTestStatus(travelerChangeStatus, true);
                                    break;

                                } else if(travelerAnswer.equals("NO"))
                                {
                                    objTraveler.ChangeTravelerTestStatus(travelerChangeStatus, false);
                                    break;

                                } else
                                {
                                    System.out.println("Answer must be " + "yes" + "or" + "no");
                                }
                            } else
                            {
                                System.out.println("Answer must be " + "yes" + "or" + "no");
                            }
                        } else
                        {
                            System.out.println("Your input must between 1 to 4 (1 and 4 included)");
                        }

                    } else
                    {
                        System.out.println("Your input must be an integer!");
                    }

                } while(!checkInput);

            } else if (travelerAnswer.equals("NO"))
            {
                checkInput = true;

            } else {

                System.out.println("Answer must be " + "yes" + " o r" + "no");
            }

        } while(!checkInput);
        System.out.println();

        //Decide if traveler can go or not
        if(objTraveler.isTravelerMaskPass)
        {
            if(objTraveler.travelerTransportaionChoice == 2)
            {
                if(objTraveler.isTravelerGeNosePass)
                {
                    objTraveler.CheckTransportationPass((short)2);

                } else
                {
                    objTraveler.CheckTransportationPass((short)5);
                }

            } else if(objTraveler.travelerTransportaionChoice == 3 || objTraveler.travelerTransportaionChoice == 4)
            {
                if(objTraveler.travelerTransportaionChoice == 3)
                {
                    if(objTraveler.isTravelerAntigenRapidPass)
                    {
                        objTraveler.CheckTransportationPass((short)3);

                    } else
                    {
                        objTraveler.CheckTransportationPass((short)5);
                    }
                } else
                {
                    if(objTraveler.isTravelerAntigenRapidPass && objTraveler.isTravelerPCRPass)
                    {
                        objTraveler.CheckTransportationPass((short)4);

                    } else
                    {
                        objTraveler.CheckTransportationPass((short)5);
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
