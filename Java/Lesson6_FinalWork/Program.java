import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
*/

public class Program {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("1", "Lenovo", "4", "512", "DOS", "black");
        Laptop laptop2 = new Laptop("2", "HP", "4", "256", "Windows", "white");
        Laptop laptop3 = new Laptop("3", "Asus", "2", "256", "Windows", "black");
        Laptop laptop4 = new Laptop("4", "Asus", "16", "1024", "Linux", "grey");
        Laptop laptop5 = new Laptop("5", "Samsung", "8", "1024", "Windows", "black");
        Laptop laptop6 = new Laptop("6", "Samsung", "16", "512", "DOS", "grey");
        Laptop laptop7 = new Laptop("7", "Lenovo", "8", "1024", "Windows", "black");

        Set<Laptop> laptops = new HashSet<>(List.of(laptop1, laptop2,
                laptop3, laptop4, laptop5, laptop6, laptop7));

        Map<String, String> sel = selectCriteria();
        sort(sel, laptops);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }

    public static Map<String, String> selectCriteria() {
        Map<String, String> resultCriterias = new HashMap<>();
        while (true) {
            System.out.print("Введите 'y' для начала подбора и 'n' для вывода результатов: ");
            String question = scanner();
            if (question.equals("n")) {
                break;
            } else {

                System.out.println(
                        "Введите цифру, соответствующую необходимому критерию:" + 
                        "\n 1 - Фирма \n 2 - Объём ОЗУ \n 3 - Объем SSD диска \n 4 - Операционная система \n 5 - Цвет");
                String key = scanner();
                System.out.println("Введите значения для выбранного критерия: ");
                String value = scanner();

                resultCriterias.put(key, value);
            }
        }
        
        System.out.println(resultCriterias);
        return resultCriterias;
    }

    public static void sort(Map<String, String> criterias, Set<Laptop> laptops) {

        Set<Laptop> temp = new HashSet<>(laptops);
        for (Laptop laptop : laptops) {

            for (Object pair : criterias.keySet()) {

                if (pair.equals("1") && !laptop.getTrademark().equals(criterias.get(pair))) {
                    temp.remove(laptop);
                }
                for (Object pair1 : criterias.keySet()) {

                    if (pair1.equals("2") && !laptop.getRamValue().equals(criterias.get(pair1))) {
                        temp.remove(laptop);

                    }
                    for (Object pair2 : criterias.keySet()) {

                        if (pair2.equals("3") && !laptop.getHardDisk().equals(criterias.get(pair2))) {
                            temp.remove(laptop);

                        }
                        for (Object pair3 : criterias.keySet()) {

                            if (pair3.equals("4") && !laptop.getOperatingSystem().equals(criterias.get(pair3))) {
                                temp.remove(laptop);

                            }
                            for (Object pair4 : criterias.keySet()) {

                                if (pair4.equals("5") && !laptop.getColour().equals(criterias.get(pair4))) {
                                    temp.remove(laptop);

                                }
                            }
                        }
                    }
                }
            }

        }
        if (temp.isEmpty()) {
            System.out.println("По введенным критериям ничего не найдено!");
        } else {
            System.out.println("Вот что мы можем предложить: \n" + temp.toString());
        }

    }
}
