public class Main{
    public static void main(String[] args) {
        UIControl control = new UIControl(true);
        TextBox textBox = new TextBox(null);
        show(textBox);
    }

    public static void show(UIControl control) {
        if(control instanceof TextBox) {
            TextBox textBox = (TextBox)control;
            textBox.setText("java is nice");
        }
        System.out.println(control);
    }
}