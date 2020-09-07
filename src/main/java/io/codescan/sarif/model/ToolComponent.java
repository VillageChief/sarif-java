package io.codescan.sarif.model;

import java.util.List;
import lombok.Data;

/**
 * A component, such as a plug-in or the driver, of the analysis tool that was run.
 */
@Data
public class ToolComponent {

    /**
     * A unique identifier for the tool component in the form of a GUID.
     *
     * Pattern: ^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[1-5][0-9a-fA-F]{3}-[89abAB][0-9a-fA-F]{3}-[0-9a-fA-F]{12}$
     */
    private String guid;

    /**
     * The name of the tool component.
     */
    private String name;

    /**
     * The organization or company that produced the tool component.
     */
    private String organization;

    /**
     * A product suite to which the tool component belongs.
     */
    private String product;

    /**
     * A localizable string containing the name of the suite of products to which the tool component belongs.
     */
    private String productSuite;

    /**
     * A brief description of the tool component.
     */
    private MultiformatMessage shortDescription;

    /**
     * A comprehensive description of the tool component.
     */
    private MultiformatMessage fullDescription;

    /**
     * The name of the tool component along with its version and any other useful identifying information, such as its locale.
     */
    private String fullName;

    /**
     * The tool component version, in whatever format the component natively provides.
     */
    private String version;

    /**
     * The tool component version in the format specified by Semantic Versioning 2.0.
     */
    private String semanticVersion;

    /**
     * The binary version of the tool component's primary executable file expressed as four non-negative integers
     * separated by a period (for operating systems that express file versions in this way).
     */
    private String dottedQuadFileVersion;

    /**
     * A string specifying the UTC date (and optionally, the time) of the component's release.
     */
    private String releaseDateUtc;

    /**
     * The absolute URI from which the tool component can be downloaded.
     */
    private String downloadUri;

    /**
     * The absolute URI at which information about this version of the tool component can be found.
     */
    private String informationUri;

    /**
     * A dictionary, each of whose keys is a resource identifier and each of whose values is a multiformatMessageString
     * object, which holds message strings in plain text and (optionally) Markdown format. The strings can include
     * placeholders, which can be used to construct a message in combination with an arbitrary number of additional
     * string arguments.
     */
    private MultiformatMessage globalMessageStrings;

    /**
     * An array of reportingDescriptor objects relevant to the notifications related to the configuration and runtime
     * execution of the tool component.
     */
    private List<ReportingDescriptor> notifications;

    /**
     * An array of reportingDescriptor objects relevant to the analysis performed by the tool component.
     */
    private List<ReportingDescriptor> rules;

    /**
     * An array of reportingDescriptor objects relevant to the definitions of both standalone and tool-defined
     * taxonomies.
     */
    private List<ReportingDescriptor> taxa;

    /**
     * An array of the artifactLocation objects associated with the tool component.
     */
    private ArtifactLocation locations;

    /**
     * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter
     * lowercase language code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code
     * associated with a country or region). The casing is recommended but not required (in order for this data to
     * conform to RFC5646).
     */
    private String language;

    /**
     * Key/value pairs that provide additional information about the tool component.
     */
    private PropertyBag properties;
}
