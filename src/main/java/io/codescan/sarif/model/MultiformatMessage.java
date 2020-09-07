package io.codescan.sarif.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A message string or message format string rendered in multiple formats.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultiformatMessage {

    /**
     * A plain text message string or format string.
     */
    private String text;

    /**
     * A Markdown message string or format string.
     */
    private String markdown;

    public MultiformatMessage(String text) {
        this.text = text;
    }
}
