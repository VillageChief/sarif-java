package io.codescan.sarif.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * A region within an artifact where a result was detected.
 */
@Data
@Accessors(chain = true)
public class Region {

    /**
     * The line number of the first character in the region.
     */
    private Integer startLine;

    /**
     * The column number of the first character in the region.
     */
    private Integer startColumn;

    /**
     * The line number of the last character in the region.
     */
    private Integer endLine;

    /**
     * The column number of the character following the end of the region.
     */
    private Integer endColumn;

    /**
     * The zero-based offset from the beginning of the artifact of the first character in the region.
     */
    private Integer charOffset;

    /**
     * The length of the region in characters.
     */
    private Integer charLength;

    /**
     * The zero-based offset from the beginning of the artifact of the first byte in the region.
     */
    private Integer byteOffset;

    /**
     * A message relevant to the region.
     */
    private Message message;
}
