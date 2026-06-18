class Doc {
    public static void main(String[] args) {
        PdfFactory factory = new PdfFactory();
        Document doc = factory.createDocument();
        doc.open();
    }
    


}
interface Document {
    void open();
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("PDF Opened");
    }
}

class PdfFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}
    
