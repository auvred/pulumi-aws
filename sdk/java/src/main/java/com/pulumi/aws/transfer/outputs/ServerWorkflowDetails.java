// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.outputs;

import com.pulumi.aws.transfer.outputs.ServerWorkflowDetailsOnPartialUpload;
import com.pulumi.aws.transfer.outputs.ServerWorkflowDetailsOnUpload;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerWorkflowDetails {
    /**
     * @return A trigger that starts a workflow if a file is only partially uploaded. See Workflow Detail below.
     * 
     */
    private @Nullable ServerWorkflowDetailsOnPartialUpload onPartialUpload;
    /**
     * @return A trigger that starts a workflow: the workflow begins to execute after a file is uploaded. See Workflow Detail below.
     * 
     */
    private @Nullable ServerWorkflowDetailsOnUpload onUpload;

    private ServerWorkflowDetails() {}
    /**
     * @return A trigger that starts a workflow if a file is only partially uploaded. See Workflow Detail below.
     * 
     */
    public Optional<ServerWorkflowDetailsOnPartialUpload> onPartialUpload() {
        return Optional.ofNullable(this.onPartialUpload);
    }
    /**
     * @return A trigger that starts a workflow: the workflow begins to execute after a file is uploaded. See Workflow Detail below.
     * 
     */
    public Optional<ServerWorkflowDetailsOnUpload> onUpload() {
        return Optional.ofNullable(this.onUpload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerWorkflowDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServerWorkflowDetailsOnPartialUpload onPartialUpload;
        private @Nullable ServerWorkflowDetailsOnUpload onUpload;
        public Builder() {}
        public Builder(ServerWorkflowDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onPartialUpload = defaults.onPartialUpload;
    	      this.onUpload = defaults.onUpload;
        }

        @CustomType.Setter
        public Builder onPartialUpload(@Nullable ServerWorkflowDetailsOnPartialUpload onPartialUpload) {

            this.onPartialUpload = onPartialUpload;
            return this;
        }
        @CustomType.Setter
        public Builder onUpload(@Nullable ServerWorkflowDetailsOnUpload onUpload) {

            this.onUpload = onUpload;
            return this;
        }
        public ServerWorkflowDetails build() {
            final var _resultValue = new ServerWorkflowDetails();
            _resultValue.onPartialUpload = onPartialUpload;
            _resultValue.onUpload = onUpload;
            return _resultValue;
        }
    }
}
