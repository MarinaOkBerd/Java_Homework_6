
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {

  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    Notebook apple = new Notebook("apple", 16, 512, "macos", "silver");
    Notebook acer = new Notebook("acer", 4, 512, "widows", "black");
    Notebook hp = new Notebook("hp", 8, 1024, "widows", "white");
    Map <String, Integer> criteronChoose = criterionNotebook();
    int ramChoose = criteronChoose.get("Ram");
    int ssdChoose = criteronChoose.get("Ssd");


    System.out.println("Результаты поиска: ");
    if(ramChoose <= apple.getRam() && ssdChoose <= apple.getSsd()) {
      System.out.println(apple);
    }
    if(ramChoose <= acer.getRam() && ssdChoose <= acer.getSsd()) {
      System.out.println(acer);
    }
    if(ramChoose <= hp.getRam() && ssdChoose <= hp.getSsd()) {
      System.out.println(hp);
    }
  }
  private static Map<String, Integer> criterionNotebook() {
    Map <String, Integer> choose = new LinkedHashMap<>();
    System.out.print("Введите объем необходимой оперативной памяти: ");
    int ram = scanner.nextInt();
    System.out.print("Введите необходимый объем жестого диска: ");
    int ssd = scanner.nextInt();
    choose.put("Ram", ram);
    choose.put("Ssd", ssd);
    return choose;
  }
}