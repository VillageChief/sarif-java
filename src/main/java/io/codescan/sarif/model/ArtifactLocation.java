package io.codescan.sarif.model;

import lombok.Data;

/**
 * Specifies the location of an artifact.
 */
@Data
public class ArtifactLocation {

    /**
     * A string containing a valid relative or absolute URI.
     */
    private String uri;

    /**
     * A string which indirectly specifies the absolute URI with respect to which a relative URI in the "uri" property
     * is interpreted.
     */
    private String uriBaseId;

    /**
     * The index within the run artifacts array of the artifact object associated with the artifact location.
     */
    private Integer index;

    /**
     * A short description of the artifact location.
     */
    private Message description;

    /**
     * Key/value pairs that provide additional information about the artifact location.
     */
    private PropertyBag properties;
}
