package io.codescan.sarif.model;

import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * The analysis tool that was run.
 */
@Data
@Accessors(chain = true)
public class Tool {

    /**
     * The analysis tool that was run.
     */
    private ToolComponent driver;

    /**
     * Tool extensions that contributed to or reconfigured the analysis tool that was run.
     */
    private List<ToolComponent> extensions;

    /**
     * Key/value pairs that provide additional information about the tool.
     */
    private PropertyBag properties;
}
