package org.example.chain_of_responsibility_pattern.documents;

public class TextDocumentHandler extends DocumentHandler{
    public TextDocumentHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openDocument(String fileExtension) {
        if (!fileExtension.equalsIgnoreCase("txt")) {
            super.openDocument(fileExtension);
            return;
        }
        System.out.println("Opening text document");
    }
}
