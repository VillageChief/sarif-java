package io.codescan.sarif.model;

import java.util.Set;
import lombok.Data;

/**
 * Key/value pairs that provide additional information about the object.
 */
@Data
public class PropertyBag {

    /**
     * A set of distinct strings that provide additional information.
     */
    private Set<String> tags;
}
