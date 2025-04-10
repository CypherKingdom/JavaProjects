package design_patterns.structural.exercise2;

public class DocumentEditorApp {
    public static void main(String[] args) {
        System.out.println("Rendering text in PDF");
        DocumentElement text1 = new Text("Hello everyone");
        DocumentElement text2 = new Text("Design Pattern are great");
        DocumentElement image = new Image("dp.png");
        DocumentElement shape = new Shape("square");

        GroupElement group = new GroupElement();
        group.add(text1);
        group.add(image);

        GroupElement nestedGroup = new GroupElement();
        nestedGroup.add(text2);
        nestedGroup.add(shape);
        nestedGroup.add(group);

        Renderer scRenderer = new ScreenRenderer();
        Renderer pdfRenderer = new PDFRenderer();

        nestedGroup.render(scRenderer);
        nestedGroup.render(pdfRenderer);

    }
}
