package io.codescan.sarif.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * A physical location relevant to a result. Specifies a reference to a programming artifact together with a range
 * of bytes or characters within that artifact.
 */
@Data
@Accessors(chain = true)
public class PhysicalLocation {

    /**
     * The address of the location.
     */
    private Address address;

    /**
     * The location of the artifact.
     */
    private ArtifactLocation artifactLocation;

    /**
     * Specifies a portion of the artifact.
     */
    private Region region;

    /**
     * Specifies a portion of the artifact that encloses the region. Allows a viewer to display additional context
     * around the region.
     */
    private Region contextRegion;
}
