package io.codescan.sarif.model;

import lombok.Data;

/**
 * A physical or virtual address, or a range of addresses, in an 'addressable region' (memory or a binary file).
 */
@Data
public class Address {

    /**
     * The address expressed as a byte offset from the start of the addressable region.
     */
    private Integer absoluteAddress;

    /**
     * The address expressed as a byte offset from the absolute address of the top-most parent object.
     */
    private Integer relativeAddress;

    /**
     * The number of bytes in this range of addresses.
     */
    private Integer length;

    /**
     * An open-ended string that identifies the address kind. 'data', 'function', 'header','instruction', 'module',
     * 'page', 'section', 'segment', 'stack', 'stackFrame', 'table' are well-known values.
     */
    private String kind;

    /**
     * A name that is associated with the address, e.g., '.text'.
     */
    private String name;

    /**
     * A human-readable fully qualified name that is associated with the address.
     */
    private String fullyQualifiedName;

    /**
     * The byte offset of this address from the absolute or relative address of the parent object.
     */
    private Integer offsetFromParent;

    /**
     * The index within run.addresses of the cached object for this address.
     */
    private Integer index;

    /**
     * The index within run.addresses of the parent object.
     */
    private Integer parentIndex;

    /**
     * Key/value pairs that provide additional information about the address.
     */
    private PropertyBag properties;
}
