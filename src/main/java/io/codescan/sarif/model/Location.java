package io.codescan.sarif.model;

import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * A location within a programming artifact.
 */
@Data
@Accessors(chain = true)
public class Location {

    /**
     * Value that distinguishes this location from all other locations within a single result object.
     */
    private Integer id;

    /**
     * Identifies the artifact and region.
     */
    private PhysicalLocation physicalLocation;

    /**
     * The logical locations associated with the result.
     */
    private List<LogicalLocation> logicalLocations;

    /**
     * A message relevant to the location.
     */
    private Message message;
}
