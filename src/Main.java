public class Main {
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();
        stringArray.addString("Эщкере");
        stringArray.addString("выгавыгавыга");
        stringArray.addString("Javaхзхзхз");

        System.out.println("Максимальная строка: " + stringArray.getMaxLengthString());
        System.out.println("Средняя длина строк: " + stringArray.getAverageLength());
    }
}