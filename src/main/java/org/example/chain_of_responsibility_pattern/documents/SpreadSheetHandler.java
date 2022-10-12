package org.example.chain_of_responsibility_pattern.documents;

public class SpreadSheetHandler extends DocumentHandler{
    public SpreadSheetHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openDocument(String fileExtension) {
        if (!fileExtension.equalsIgnoreCase("xlsx")) {
            super.openDocument(fileExtension);
            return;
        }
        System.out.println("Opening Spread sheet document");
    }
}
