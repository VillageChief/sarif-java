package io.codescan.sarif.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Encapsulates a message intended to be read by the end user.
 */
@Data
@Accessors(chain = true)
public class Message {

    /**
     * A plain text message string.
     */
    private String text;

    /**
     * A Markdown message string.
     */
    private String markdown;

    /**
     * The identifier for this message.
     */
    private String id;
}
