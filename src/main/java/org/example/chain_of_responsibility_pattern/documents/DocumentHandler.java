package org.example.chain_of_responsibility_pattern.documents;

/**
 * This is a chain of documents that will be passed along until we find a handler
 */
public abstract class DocumentHandler {
    private DocumentHandler next;

    public DocumentHandler(DocumentHandler next) {
        this.next = next;
    }

    public void openDocument(String fileExtension){
        if (next != null){
            next.openDocument(fileExtension);
        }
    }
}
