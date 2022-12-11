import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void menu() {

        System.out.println(" ");
        System.out.println("Натисніть 0: Чи існує такий місяць?");
        System.out.println("Натисніть 1: Вивести всі місяці з такою ж порою року");
        System.out.println("Натисніть 2: Вивести всі місяці які мають таку саму кількість днів");
        System.out.println("Натисніть 3: Вивести на екран всі місяці які мають меншу кількість днів");
        System.out.println("Натисніть 4: Вивести на екран всі місяці які мають більшу кількість днів");
        System.out.println("Натисніть 5: Вивести на екран наступну пору року");
        System.out.println("Натисніть 6: Вивести на екран попередню пору року");
        System.out.println("Натисніть 7: Вивести на екран всі місяці які мають парну кількість днів");
        System.out.println("Натисніть 8: Вивести на екран всі місяці які мають непарну кількість днів");
        System.out.println("Натисніть 9: Вивести на екран чи введений з консолі місяць має парну кількість днів");
        System.out.println(" ");
    }

    public static void main(String[] args) throws WrongInputConsoleParametersException {

        Seasons[] masSeason = Seasons.values();
        Months[] masMonth = Months.values();

        try {
            while (true) {
                menu();
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                String text;
                switch (number) {
                    case 0: {
                        System.out.println("Введіть назву місяця");
                        sc = new Scanner(System.in);
                        text = sc.next().toUpperCase();
                        boolean flag = false;
                        for (Months months : masMonth) {
                            if (months.name().equals(text)) {
                                flag = true;
                            }
                        }

                        if (!flag) {
                            System.out.println("Цього місяця не існую");
                        } else {
                            System.out.println("Цей місяць існую");
                        }
                        break;
                    }
                    case 1: {
                        System.out.println("Введіть пору року");
                        sc = new Scanner(System.in);
                        text = sc.next().toUpperCase();
                        boolean flag = false;
                        for (Seasons masSeasons : masSeason) {
                            if (masSeasons.name().equals(text)) {
                                flag = true;
                            }
                        }

                        if (!flag) {
                            System.out.println("Цієї пори року не існую");
                        } else {

                            for (Months months : masMonth) {
                                if (months.getSeasons().name().equalsIgnoreCase(text)) {
                                    System.out.println(months.name());
                                }
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Введіть кількість днів:");
                        sc = new Scanner(System.in);
                        number = sc.nextInt();
                        boolean flag = MonthOfCountDay(masMonth, number);
                        if (!flag) {
                            System.out.println("Немає такої кількості");
                        } else {
                            System.out.println("Кількість днів: " + number);
                            for (Months months : masMonth) {
                                if (months.getDays() == number) {
                                    System.out.println(months.name());
                                }
                            }
                        }
                        break;
                    }

                    case 3: {
                        int max = 0;
                        for (Months months : masMonth) {
                            if (months.getDays() > max) {
                                max = months.getDays();
                            }
                        }
                        for (Months months : masMonth) {
                            if (months.getDays() != max) {
                                System.out.println(months.name());
                            }
                        }
                        break;
                    }

                    case 4: {
                        int max = 0;
                        for (Months months : masMonth) {
                            if (months.getDays() > max) {
                                max = months.getDays();
                            }
                        }
                        for (Months months : masMonth) {
                            if (months.getDays() == max) {
                                System.out.println(months.name());
                            }
                        }
                        break;
                    }

                    case 5: {
                        System.out.println("Введіть пору року:");
                        sc = new Scanner(System.in);
                        text = sc.next().toUpperCase();
                        boolean flag = false;
                        for (Seasons masSeasons : masSeason) {
                            if (masSeasons.name().equals(text)) {
                                flag = true;
                            }
                        }
                        if (!flag) {
                            System.out.println("Цієї пори року не існую");
                        } else {
                            Seasons s = Seasons.valueOf(text);
                            if (s.ordinal() == masSeason.length - 1) {
                                System.out.println(masSeason[s.ordinal() - 3]);
                            } else {
                                System.out.println(masSeason[s.ordinal() + 1]);
                            }
                        }
                        break;
                    }

                    case 6: {
                        System.out.println("Введіть пору року:");
                        sc = new Scanner(System.in);
                        text = sc.next().toUpperCase();
                        boolean flag = false;
                        for (Seasons masSeasons : masSeason) {
                            if (masSeasons.name().equals(text)) {
                                flag = true;
                            }
                        }
                        if (!flag) {
                            System.out.println("Цієї пори року не існую");
                        } else {
                            Seasons s = Seasons.valueOf(text);
                            if (s.ordinal() == 0) {
                                System.out.println(masSeason[s.ordinal() + 3]);
                            } else {
                                System.out.println(masSeason[s.ordinal() - 1]);
                            }
                        }
                        break;
                    }
                    case 7: {
                        for (Months months : masMonth) {
                            if (months.getDays() % 2 == 0) {
                                System.out.println(months.name());
                            }
                        }
                        break;
                    }
                    case 8: {
                        for (Months months : masMonth) {
                            if (months.getDays() % 2 == 1) {
                                System.out.println(months.name());
                            }
                        }
                        break;
                    }
                    case 9: {
                        System.out.println("Введіть назву місяця");
                        sc = new Scanner(System.in);
                        text = sc.next().toUpperCase();
                        boolean flag = false;
                        for (Months months : masMonth) {
                            if (months.name().equals(text)) {
                                flag = true;
                            }
                        }

                        if (!flag) {
                            System.out.println("Цього місяця не існую");
                        } else {
                            Months m = Months.valueOf(text);
                            if (m.getDays() % 2 == 0) {
                                System.out.println("Цей місяць має парну кількість днів");
                            } else {
                                System.out.println("Цей місяць має не парну кількість днів");
                            }
                        }
                        break;
                    }
                }
            }
        } catch (InputMismatchException e) {
                String msg = "Значення повинні бути від 0 до 9";
                throw new WrongInputConsoleParametersException(msg);
            }
        }

    /**
     * @exception WrongInputConsoleParametersException
     * @author Uliana
     * @return null
     * @see java code convention
     **/
    private static boolean MonthOfCountDay(Months[] masMonth, int inputsc) {
        boolean flag = false;

        for (Months m : masMonth) {
            if (m.getDays() == inputsc) {
                System.out.println(m.name());
                flag = true;
            }
        }
        return flag;
    }
}
