// By Logan Pizzurro
// CSI-2140
// Professor Ma; TA. Li Sa

import java.util.Scanner;

public class ClassDemo {

    public static float metricConverter(String sourceMetric, String targetMetric, float sourceNum) {
        float targetNum = 0;
        switch (sourceMetric) {
            case "km":
                switch (targetMetric) {
                    case "m":
                        targetNum = sourceNum * 1000;
                        break;
                    case "mi":
                        targetNum = sourceNum / 1.609f;
                        break;
                    case "cm":
                        targetNum = sourceNum * 100000;
                        break;
                    case "mm":
                        targetNum = sourceNum * 1000000;
                        break;
                    default:
                        //System.out.println(sourceMetric + " not supported\n");
                }
            case "g":
                switch (targetMetric) {
                    case "kg":
                        targetNum = sourceNum / 1000;
                        break;
                    case "oz":
                        targetNum = sourceNum / 28.35f;
                        break;
                    case "lb":
                        targetNum = sourceNum / 453.6f;
                        break;
                    default:
                       // System.out.println(sourceMetric + " not supported\n");
                }
            case "mm":
            
                switch (targetMetric) {
                    case "m":
                        targetNum = sourceNum / 1000;
                        break;
                    case "mi":
                        targetNum = sourceNum / 1609000;
                        break;
                    case "cm":
                        targetNum = sourceNum / 10;
                        break;
                    case "km":
                        targetNum = sourceNum / 1000000;
                        break;
                    default:
                        //System.out.println(sourceMetric + " not supported\n");
                }
            case "m":
                switch (targetMetric) {
                    case "km":
                        targetNum = sourceNum / 1000;
                        break;
                    case "mi":
                        targetNum = sourceNum / 1609;
                        break;
                    case "cm":
                        targetNum = sourceNum * 100;
                        break;
                    case "mm":
                        targetNum = sourceNum * 1000;
                        break;
                    case "yd":
                        targetNum = sourceNum * 1.094f;
                        break;
                    default:
                        //System.out.println(sourceMetric + " not supported\n");
                }
            case "kg":
                switch (targetMetric) {
                    case "g":
                        targetNum = sourceNum * 1000;
                        break;
                    case "oz":
                        targetNum = sourceNum * 35.274f;
                        break;
                    case "lb":
                        targetNum = sourceNum * 2.205f;
                        break;
                    default:
                        //System.out.println(sourceMetric + " not supported\n");
                }
            case "kmph":
                switch (targetMetric) {
                    case "mph":
                        targetNum = sourceNum / 1.609f;
                        break;
                    case "knots":
                        targetNum = sourceNum / 1.852f;
                        break;
                    default:
                        //System.out.println(sourceMetric + " not supported\n");
                }
            case "c":
                switch (targetMetric) {
                    case "f":
                        targetNum = (sourceNum * 9 / 5) + 32;
                        break;
                    case "k":
                        targetNum = sourceNum + 273.15f;
                        break;
                    default:
                        //System.out.println(sourceMetric + " not supported\n");
                }
            case "L":
                switch (targetMetric) {
                    case "gal":
                        targetNum = sourceNum / 3.785f;
                        break;
                    case "qt":
                        targetNum = sourceNum / 0.946f;
                        break;
                    case "pt":
                        targetNum = sourceNum / 0.473f;
                        break;
                    case "cup":
                        targetNum = sourceNum / 0.236f;
                        break;
                    case "oz":
                        targetNum = sourceNum / 0.0296f;
                        break;
                    case "tbsp":
                        targetNum = sourceNum / 0.015f;
                        break;
                    case "tsp":
                        targetNum = sourceNum / 0.005f;
                        break;
                    default:
                        System.out.println(targetMetric + " not supported\n");
                }
        }
        if (targetNum == 0) {
            System.out.println(sourceMetric + " not supported\n");
        } else {
            System.out.printf("%.2f %s = %.2f %s\n", sourceNum, sourceMetric, targetNum, targetMetric);
        }    
        return targetNum;
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String str;

        String[] strArray;
        float sourceNum;
        String sourceMetric;
        String targetMetric;
        while (true) {
            System.out.println("""
            ooo        ooooo               .             o8o                   .oooooo.                                                            .                      
            `88.       .888'             .o8             `"'                  d8P'  `Y8b                                                         .o8                      
            888b     d'888   .ooooo.  .o888oo oooo d8b oooo   .ooooo.       888           .ooooo.  ooo. .oo.   oooo    ooo  .ooooo.  oooo d8b .o888oo  .ooooo.  oooo d8b 
            8 Y88. .P  888  d88' `88b   888   `888""8P `888  d88' `"Y8      888          d88' `88b `888P"Y88b   `88.  .8'  d88' `88b `888""8P   888   d88' `88b `888""8P 
            8  `888'   888  888ooo888   888    888      888  888            888          888   888  888   888    `88..8'   888ooo888  888       888   888ooo888  888     
            8    Y     888  888    .o   888 .  888      888  888   .o8      `88b    ooo  888   888  888   888     `888'    888    .o  888       888 . 888    .o  888     
            o8o        o888o `Y8bod8P'   "888" d888b    o888o `Y8bod8P'       `Y8bood8P'  `Y8bod8P' o888o o888o     `8'     `Y8bod8P' d888b      "888" `Y8bod8P' d888b\n    
            """);
            System.out.println("Please input your metric to be converted.");
            str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("Thank you, goodbye!\n");
                scanner.close();
                break;

            }
            strArray = str.split(" ");
            if (strArray.length != 4) {
                System.out.println("Invalid input, please try again.\n");

                continue;
            } else {
                sourceNum = Float.parseFloat(strArray[0]);
                sourceMetric = strArray[1];
                targetMetric = strArray[3];
                metricConverter(sourceMetric, targetMetric, sourceNum);
            }
        }
