import java.util.Random;
import java.util.Scanner;

public class Tiktakto {

    public Tiktakto() {
    }

    public static void main(String[] args) {
        String[][] tab = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        boolean gagne = true;

        while(true) {
            while(gagne) {
                tableau(tab);
                joueur(tab);
                ordi(tab);
                saisircase(tab);
                if (tab[0][0].equals("X") && tab[0][1].equals("X") && tab[0][2].equals("X")) {
                    System.out.println("vous avez gagner");
                    gagne = false;
                } else if (tab[1][0].equals("X") && tab[1][1].equals("X") && tab[1][2].equals("X")) {
                    System.out.println("vous avez gagner");
                    gagne = false;
                } else if (tab[2][0].equals("X") && tab[2][1].equals("X") && tab[2][2].equals("X")) {
                    System.out.println("vous avez gagner");
                    gagne = false;
                } else if (tab[0][0].equals("X") && tab[1][1].equals("X") && tab[2][2].equals("X")) {
                    System.out.println("vous avez gagner");
                    gagne = false;
                } else if (tab[2][0].equals("X") && tab[1][1].equals("X") && tab[0][2].equals("X")) {
                    System.out.println("vous avez gagner");
                    gagne = false;
                } else if (tab[0][1].equals("X") && tab[1][1].equals("X") && tab[1][1].equals("X")) {
                    System.out.println("vous avez gagner");
                    gagne = false;
                } else if (tab[0][0].equals("X") && tab[1][0].equals("X") && tab[2][0].equals("X")) {
                    System.out.println("vous avez gagner");
                    gagne = false;
                } else if (tab[0][2].equals("X") && tab[1][2].equals("X") && tab[2][2].equals("X")) {
                    System.out.println("vous avez gagner");
                    gagne = false;
                } else if (tab[0][0].equals("o") && tab[0][1].equals("o") && tab[0][2].equals("o")) {
                    System.out.println("l'ordi a gagner");
                    gagne = false;
                } else if (tab[1][0].equals("o") && tab[1][1].equals("o") && tab[1][2].equals("o")) {
                    System.out.println("l'ordi a gagner");
                    gagne = false;
                } else if (tab[2][0].equals("o") && tab[2][1].equals("o") && tab[2][2].equals("o")) {
                    System.out.println("l'ordi a gagner");
                    gagne = false;
                } else if (tab[0][0].equals("o") && tab[1][1].equals("o") && tab[2][2].equals("o")) {
                    System.out.println("l'ordi a gagner");
                    gagne = false;
                } else if (tab[2][0].equals("o") && tab[1][1].equals("o") && tab[0][2].equals("o")) {
                    System.out.println("l'ordi a gagner");
                    gagne = false;
                } else if (tab[0][1].equals("o") && tab[1][1].equals("o") && tab[1][2].equals("o")) {
                    System.out.println("vous avez gagner");
                    gagne = false;
                } else if (tab[0][0].equals("o") && tab[1][0].equals("o") && tab[2][0].equals("o")) {
                    System.out.println("vous avez gagner");
                    gagne = false;
                } else if (tab[0][2].equals("o") && tab[1][2].equals("o") && tab[2][2].equals("o")) {
                    System.out.println("vous avez gagner");
                    gagne = false;
                } else {
                    gagne = true;
                }
            }

            return;
        }
    }

    public static void joueur(String[][] tab) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choisir une case");
        String j = input.nextLine();
        byte var4 = -1;
        switch(j.hashCode()) {
            case 49:
                if (j.equals("1")) {
                    var4 = 0;
                }
                break;
            case 50:
                if (j.equals("2")) {
                    var4 = 1;
                }
                break;
            case 51:
                if (j.equals("3")) {
                    var4 = 2;
                }
                break;
            case 52:
                if (j.equals("4")) {
                    var4 = 3;
                }
                break;
            case 53:
                if (j.equals("5")) {
                    var4 = 4;
                }
                break;
            case 54:
                if (j.equals("6")) {
                    var4 = 5;
                }
                break;
            case 55:
                if (j.equals("7")) {
                    var4 = 6;
                }
                break;
            case 56:
                if (j.equals("8")) {
                    var4 = 7;
                }
                break;
            case 57:
                if (j.equals("9")) {
                    var4 = 8;
                }
        }
        switch(var4) {
            case 0:
                tab[0][0] = "X";
                break;
            case 1:
                tab[0][1] = "X";
                break;
            case 2:
                tab[0][2] = "X";
                break;
            case 3:
                tab[1][0] = "X";
                break;
            case 4:
                tab[1][1] = "X";
                break;
            case 5:
                tab[1][2] = "X";
                break;
            case 6:
                tab[2][0] = "X";
                break;
            case 7:
                tab[2][1] = "X";
                break;
            case 8:
                tab[2][2] = "X";
                break;
            default:
                System.out.println(":(");
        }


        tableau(tab);
    }

    public static void tableau(String[][] tab) {
        System.out.println(tab[0][0] + "|" + tab[0][1] + "|" + tab[0][2]);
        System.out.println("-+-+-");
        System.out.println(tab[1][0] + "|" + tab[1][1] + "|" + tab[1][2]);
        System.out.println("-+-+-");
        System.out.println(tab[2][0] + "|" + tab[2][1] + "|" + tab[2][2]);
    }

    public static void ordi(String[][] tab) {
        Random pc = new Random();
        int ordiplay = pc.nextInt(9);
        System.out.println("ordinateur");
        switch(ordiplay) {
            case 1:
                tab[0][0] = "o";
                break;
            case 2:
                tab[0][1] = "o";
                break;
            case 3:
                tab[0][2] = "o";
                break;
            case 4:
                tab[1][0] = "o";
                break;
            case 5:
                tab[1][1] = "o";
                break;
            case 6:
                tab[1][2] = "o";
                break;
            case 7:
                tab[2][0] = "o";
                break;
            case 8:
                tab[2][1] = "o";
                break;
            case 9:
                tab[2][2] = "o";
        }

    }

    public static Integer saisircase(String[][] tab) {
        Scanner input = new Scanner(System.in);

        Integer i;
        try {
            System.out.println("Choisir une case");
            i = input.nextInt();
            if (i < 1 || i > 9) {
                System.out.println("Erreur dans la saisie. Recommencez");
                i = saisircase(tab);
            }

            if (!tab[0][0].equals("X") && !tab[0][0].equals("o")) {
                System.out.println("deja utiliser");
                i = saisircase(tab);
                if (!tab[0][1].equals("X") && !tab[0][1].equals("o")) {
                    System.out.println("deja utiliser");
                    i = saisircase(tab);
                    if (!tab[0][2].equals("X") && !tab[0][2].equals("o")) {
                        System.out.println("deja utiliser");
                        i = saisircase(tab);
                        if (!tab[1][0].equals("X") && !tab[1][0].equals("o")) {
                            System.out.println("deja utiliser");
                            i = saisircase(tab);
                            if (!tab[1][1].equals("X") && !tab[1][1].equals("o")) {
                                System.out.println("deja utiliser");
                                i = saisircase(tab);
                                if (!tab[1][2].equals("X") && !tab[1][2].equals("o")) {
                                    System.out.println("deja utiliser");
                                    i = saisircase(tab);
                                    if (!tab[2][0].equals("X") && !tab[2][0].equals("o")) {
                                        System.out.println("deja utiliser");
                                        i = saisircase(tab);
                                        if (!tab[2][1].equals("X") && !tab[2][1].equals("o")) {
                                            System.out.println("deja utiliser");
                                            i = saisircase(tab);
                                            if (tab[2][2].equals("X") || tab[2][2].equals("o")) {
                                                System.out.println("deja utiliser");
                                                i = saisircase(tab);
                                            }
                                        } else {
                                        }
                                    } else {
                                    }
                                } else {
                                }
                            } else {
                            }
                        } else {
                        }
                    } else {
                    }
                } else {
                }
            } else {
            }
        } catch (Exception var4) {
            System.out.println("Erreur dans la saisie. Recommencez");
            i = saisircase(tab);
        }

        return i;
    }

}