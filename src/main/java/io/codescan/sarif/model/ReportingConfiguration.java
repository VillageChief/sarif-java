package io.codescan.sarif.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Information about a rule or notification that can be configured at runtime.
 */
@Data
@Accessors(chain = true)
public class ReportingConfiguration {

    /**
     * Specifies whether the report may be produced during the scan.
     */
    private boolean enabled = true;

    /**
     * Specifies the failure level for the report.
     */
    private SeverityLevel level;

    /**
     * Specifies the relative priority of the report. Used for analysis output only.
     */
    private Float rank;

    /**
     * Contains configuration information specific to a report.
     */
    private PropertyBag parameters;

    /**
     * Key/value pairs that provide additional information about the reporting configuration.
     */
    private PropertyBag properties;
}
