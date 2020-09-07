package io.codescan.sarif.model;

import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Metadata that describes a specific report produced by the tool, as part of the analysis it provides or its runtime
 * reporting.
 */
@Data
@Accessors(chain = true)
public class ReportingDescriptor {

    /**
     * A stable, opaque identifier for the report.
     */
    private String id;

    /**
     * An array of stable, opaque identifiers by which this report was known in some previous version of the analysis tool.
     */
    private String[] deprecatedIds;

    /**
     * A report identifier that is understandable to an end user.
     */
    private String name;

    /**
     * An array of readable identifiers by which this report was known in some previous version of the analysis tool.
     */
    private String[] deprecatedNames;

    /**
     * A unique identifier for the reporting descriptor in the form of a GUID.
     */
    private String guid;

    /**
     * An array of unique identifies in the form of a GUID by which this report was known in some previous version of
     * the analysis tool.
     */
    private String[] deprecatedGuids;

    /**
     * A concise description of the report. Should be a single sentence that is understandable when visible space is
     * limited to a single line of text.
     */
    private MultiformatMessage shortDescription;

    /**
     * A description of the report. Should, as far as possible, provide details sufficient to enable resolution of any
     * problem indicated by the result.
     */
    private MultiformatMessage fullDescription;

    /**
     * A set of name/value pairs with arbitrary names. Each value is a multiformatMessageString object, which holds
     * message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can
     * be used to construct a message in combination with an arbitrary number of additional string arguments.
     */
    private MultiformatMessage messageStrings;

    /**
     * Default reporting configuration information.
     */
    private ReportingConfiguration defaultConfiguration;

    /**
     * A URI where the primary documentation for the report can be found.
     */
    private String helpUri;

    /**
     * Provides the primary documentation for the report, useful when there is no online documentation.
     */
    private MultiformatMessage help;

    /**
     * An array of objects that describe relationships between this reporting descriptor and others.
     */
    private List<ReportingDescriptorRelationship> relationships;

    /**
     * Key/value pairs that provide additional information about the report.
     */
    private PropertyBag properties;
}
