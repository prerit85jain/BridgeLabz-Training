package staticMethodInterfaces;

interface DataExporter {

    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON (default implementation)");
    }
}

class CSVExporter implements DataExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Exporting data to CSV format");
    }

    @Override
    public void exportToPDF() {
        System.out.println("CSVExporter exporting to PDF");
    }
}

class PDFExporter implements DataExporter {

    @Override
    public void exportToCSV() {
        System.out.println("PDFExporter exporting to CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Exporting data to PDF format");
    }
}

class JSONExporter implements DataExporter {

    @Override
    public void exportToCSV() {
        System.out.println("JSONExporter exporting to CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("JSONExporter exporting to PDF");
    }

    @Override
    public void exportToJSON() {
        System.out.println("Exporting data to JSON (custom implementation)");
    }
}

public class DataExport {

    public static void main(String[] args) {

        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();
        DataExporter json = new JSONExporter();

        System.out.println("---- CSV Exporter ----");
        csv.exportToCSV();
        csv.exportToPDF();
        csv.exportToJSON();

        System.out.println("\n---- PDF Exporter ----");
        pdf.exportToCSV();
        pdf.exportToPDF();
        pdf.exportToJSON();

        System.out.println("\n---- JSON Exporter ----");
        json.exportToCSV();
        json.exportToPDF();
        json.exportToJSON();
    }
}
