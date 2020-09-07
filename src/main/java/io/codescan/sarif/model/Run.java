package io.codescan.sarif.model;

import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Describes a single run of an analysis tool, and contains the reported output of that run.
 */
@Data
@Accessors(chain = true)
public class Run {

    /**
     * Information about the tool or tool pipeline that generated the results in this run. A run can only contain
     * results produced by a single tool or tool pipeline. A run can aggregate results from multiple log files, as long
     * as context around the tool run (tool command-line arguments and the like) is identical for all aggregated files.
     */
    private Tool tool;

    /**
     * The set of results contained in an SARIF log. The results array can be omitted when a run is solely exporting
     * rules metadata. It must be present (but may be empty) if a log file represents an actual scan.
     */
    private List<Result> results;
}
