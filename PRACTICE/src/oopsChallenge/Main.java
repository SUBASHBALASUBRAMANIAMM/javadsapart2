package oopsChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("santhosh",20,
                new Eye("Left Eye","short sight","black",true),
                new Eye("Rigth Eye","long sight","blue",false),
                new Heart("Heart","Normal",70),
                new Stomach("Stomach","PUD",false),
                new Skin("Skin","Burned","black",50));

        System.out.println("Name : " + patient.getName());
        System.out.println("Age : " + patient.getAge());

        boolean shouldFinish = false;

    while (!shouldFinish){
        System.out.println("Chooese the organ : " +
                "\n\t1.Left Eye" +
                "\n\t2.Right Eye" +
                "\n\t3.Heart" +
                "\n\t4.Stomach" +
                "\n\t5.Skin"+
                "\n\t6.Quit");

        Scanner in = new Scanner(System.in);
        int res = in.nextInt();

        switch (res){
            case 1:
                patient.getLefteye().getDetails();
                if(patient.getLefteye().isOpened()){
                    System.out.println("The eye is opened ");
                    System.out.println("\t\t1.close the eye");
                    if(in.nextInt()==1){
                        patient.getLefteye().close();

                    }else{
                        continue;
                    }
                }else{
                    System.out.println("The eye is closed ");
                    System.out.println("\t\t1.Open the eye");
                    if(in.nextInt()==1){
                        patient.getLefteye().open();


                    }else{
                        continue;
                    }
                }
                break;

            case 2:
                patient.getLefteye().getDetails();
                if(patient.getRighteye().isOpened()){
                    System.out.println("The eye is opened ");
                    System.out.println("\t\t1.close the eye");
                    if(in.nextInt()==1){
                        patient.getRighteye().close();


                    }else{
                        continue;
                    }
                }else{
                    System.out.println("The eye is closed ");
                    System.out.println("\t\t1.Open the eye");
                    if(in.nextInt()==1){
                        patient.getRighteye().open();


                    }else{
                        continue;
                    }
                }
                break;
            case 3:
                patient.getHeart().getDetails();
                System.out.println("\t1.Change the heart rate");
                if(in.nextInt()==1){
                    System.out.println("Enter the heart rate : ");
                    int newHeartRate = in.nextInt();
                    patient.getHeart().setHeartRate(newHeartRate);

                }else{
                    continue;
                }
                break;
            case 4:
                patient.getStomach().getDetails();
                System.out.println("\t1.Digest");
                if(in.nextInt()==1){
                    patient.getStomach().digest();
                }else{
                    continue;
            }
                break;
            case 5:
                patient.getSkin().getDetails();
                break;
            default:
                shouldFinish = true;
                break;
        }

    }
    }


}
