import java.util.HashSet;

public class IDScanner {
    private HashSet<String> scannedIDs;

    public IDScanner() {
        scannedIDs = new HashSet<>();
    }

    public void scanID(String id) {
        if (scannedIDs.contains(id)) {
            System.out.println("ID " + id + " has already been scanned.");
        } else {
            scannedIDs.add(id);
            System.out.println("ID " + id + " scanned successfully.");
        }
    }

    public boolean isIDScanned(String id) {
        return scannedIDs.contains(id);
    }

    public static void main(String[] args) {
        IDScanner scanner = new IDScanner();

        scanner.scanID("ABC123");
        scanner.scanID("DEF456");
        scanner.scanID("ABC123"); // This ID has already been scanned

        System.out.println("Is ABC123 scanned? " + scanner.isIDScanned("ABC123")); // true
        System.out.println("Is XYZ789 scanned? " + scanner.isIDScanned("XYZ789")); // false
    }
}