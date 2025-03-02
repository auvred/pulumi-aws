// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateNoteArgs;
import com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateRelatedFindingArgs;
import com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateSeverityArgs;
import com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateWorkflowArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomationRuleActionFindingFieldsUpdateArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationRuleActionFindingFieldsUpdateArgs Empty = new AutomationRuleActionFindingFieldsUpdateArgs();

    /**
     * The rule action updates the `Confidence` field of a finding.
     * 
     */
    @Import(name="confidence")
    private @Nullable Output<Integer> confidence;

    /**
     * @return The rule action updates the `Confidence` field of a finding.
     * 
     */
    public Optional<Output<Integer>> confidence() {
        return Optional.ofNullable(this.confidence);
    }

    /**
     * The rule action updates the `Criticality` field of a finding.
     * 
     */
    @Import(name="criticality")
    private @Nullable Output<Integer> criticality;

    /**
     * @return The rule action updates the `Criticality` field of a finding.
     * 
     */
    public Optional<Output<Integer>> criticality() {
        return Optional.ofNullable(this.criticality);
    }

    /**
     * A resource block that updates the note. Documented below.
     * 
     */
    @Import(name="note")
    private @Nullable Output<AutomationRuleActionFindingFieldsUpdateNoteArgs> note;

    /**
     * @return A resource block that updates the note. Documented below.
     * 
     */
    public Optional<Output<AutomationRuleActionFindingFieldsUpdateNoteArgs>> note() {
        return Optional.ofNullable(this.note);
    }

    /**
     * A resource block that the rule action updates the `RelatedFindings` field of a finding. Documented below.
     * 
     */
    @Import(name="relatedFindings")
    private @Nullable Output<List<AutomationRuleActionFindingFieldsUpdateRelatedFindingArgs>> relatedFindings;

    /**
     * @return A resource block that the rule action updates the `RelatedFindings` field of a finding. Documented below.
     * 
     */
    public Optional<Output<List<AutomationRuleActionFindingFieldsUpdateRelatedFindingArgs>>> relatedFindings() {
        return Optional.ofNullable(this.relatedFindings);
    }

    /**
     * A resource block that updates to the severity information for a finding. Documented below.
     * 
     */
    @Import(name="severity")
    private @Nullable Output<AutomationRuleActionFindingFieldsUpdateSeverityArgs> severity;

    /**
     * @return A resource block that updates to the severity information for a finding. Documented below.
     * 
     */
    public Optional<Output<AutomationRuleActionFindingFieldsUpdateSeverityArgs>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * The rule action updates the `Types` field of a finding.
     * 
     */
    @Import(name="types")
    private @Nullable Output<List<String>> types;

    /**
     * @return The rule action updates the `Types` field of a finding.
     * 
     */
    public Optional<Output<List<String>>> types() {
        return Optional.ofNullable(this.types);
    }

    /**
     * The rule action updates the `UserDefinedFields` field of a finding.
     * 
     */
    @Import(name="userDefinedFields")
    private @Nullable Output<Map<String,String>> userDefinedFields;

    /**
     * @return The rule action updates the `UserDefinedFields` field of a finding.
     * 
     */
    public Optional<Output<Map<String,String>>> userDefinedFields() {
        return Optional.ofNullable(this.userDefinedFields);
    }

    /**
     * The rule action updates the `VerificationState` field of a finding. The allowed values are the following `UNKNOWN`, `TRUE_POSITIVE`, `FALSE_POSITIVE` and `BENIGN_POSITIVE`.
     * 
     */
    @Import(name="verificationState")
    private @Nullable Output<String> verificationState;

    /**
     * @return The rule action updates the `VerificationState` field of a finding. The allowed values are the following `UNKNOWN`, `TRUE_POSITIVE`, `FALSE_POSITIVE` and `BENIGN_POSITIVE`.
     * 
     */
    public Optional<Output<String>> verificationState() {
        return Optional.ofNullable(this.verificationState);
    }

    /**
     * A resource block that is used to update information about the investigation into the finding. Documented below.
     * 
     */
    @Import(name="workflow")
    private @Nullable Output<AutomationRuleActionFindingFieldsUpdateWorkflowArgs> workflow;

    /**
     * @return A resource block that is used to update information about the investigation into the finding. Documented below.
     * 
     */
    public Optional<Output<AutomationRuleActionFindingFieldsUpdateWorkflowArgs>> workflow() {
        return Optional.ofNullable(this.workflow);
    }

    private AutomationRuleActionFindingFieldsUpdateArgs() {}

    private AutomationRuleActionFindingFieldsUpdateArgs(AutomationRuleActionFindingFieldsUpdateArgs $) {
        this.confidence = $.confidence;
        this.criticality = $.criticality;
        this.note = $.note;
        this.relatedFindings = $.relatedFindings;
        this.severity = $.severity;
        this.types = $.types;
        this.userDefinedFields = $.userDefinedFields;
        this.verificationState = $.verificationState;
        this.workflow = $.workflow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationRuleActionFindingFieldsUpdateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationRuleActionFindingFieldsUpdateArgs $;

        public Builder() {
            $ = new AutomationRuleActionFindingFieldsUpdateArgs();
        }

        public Builder(AutomationRuleActionFindingFieldsUpdateArgs defaults) {
            $ = new AutomationRuleActionFindingFieldsUpdateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param confidence The rule action updates the `Confidence` field of a finding.
         * 
         * @return builder
         * 
         */
        public Builder confidence(@Nullable Output<Integer> confidence) {
            $.confidence = confidence;
            return this;
        }

        /**
         * @param confidence The rule action updates the `Confidence` field of a finding.
         * 
         * @return builder
         * 
         */
        public Builder confidence(Integer confidence) {
            return confidence(Output.of(confidence));
        }

        /**
         * @param criticality The rule action updates the `Criticality` field of a finding.
         * 
         * @return builder
         * 
         */
        public Builder criticality(@Nullable Output<Integer> criticality) {
            $.criticality = criticality;
            return this;
        }

        /**
         * @param criticality The rule action updates the `Criticality` field of a finding.
         * 
         * @return builder
         * 
         */
        public Builder criticality(Integer criticality) {
            return criticality(Output.of(criticality));
        }

        /**
         * @param note A resource block that updates the note. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder note(@Nullable Output<AutomationRuleActionFindingFieldsUpdateNoteArgs> note) {
            $.note = note;
            return this;
        }

        /**
         * @param note A resource block that updates the note. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder note(AutomationRuleActionFindingFieldsUpdateNoteArgs note) {
            return note(Output.of(note));
        }

        /**
         * @param relatedFindings A resource block that the rule action updates the `RelatedFindings` field of a finding. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder relatedFindings(@Nullable Output<List<AutomationRuleActionFindingFieldsUpdateRelatedFindingArgs>> relatedFindings) {
            $.relatedFindings = relatedFindings;
            return this;
        }

        /**
         * @param relatedFindings A resource block that the rule action updates the `RelatedFindings` field of a finding. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder relatedFindings(List<AutomationRuleActionFindingFieldsUpdateRelatedFindingArgs> relatedFindings) {
            return relatedFindings(Output.of(relatedFindings));
        }

        /**
         * @param relatedFindings A resource block that the rule action updates the `RelatedFindings` field of a finding. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder relatedFindings(AutomationRuleActionFindingFieldsUpdateRelatedFindingArgs... relatedFindings) {
            return relatedFindings(List.of(relatedFindings));
        }

        /**
         * @param severity A resource block that updates to the severity information for a finding. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<AutomationRuleActionFindingFieldsUpdateSeverityArgs> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity A resource block that updates to the severity information for a finding. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder severity(AutomationRuleActionFindingFieldsUpdateSeverityArgs severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param types The rule action updates the `Types` field of a finding.
         * 
         * @return builder
         * 
         */
        public Builder types(@Nullable Output<List<String>> types) {
            $.types = types;
            return this;
        }

        /**
         * @param types The rule action updates the `Types` field of a finding.
         * 
         * @return builder
         * 
         */
        public Builder types(List<String> types) {
            return types(Output.of(types));
        }

        /**
         * @param types The rule action updates the `Types` field of a finding.
         * 
         * @return builder
         * 
         */
        public Builder types(String... types) {
            return types(List.of(types));
        }

        /**
         * @param userDefinedFields The rule action updates the `UserDefinedFields` field of a finding.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedFields(@Nullable Output<Map<String,String>> userDefinedFields) {
            $.userDefinedFields = userDefinedFields;
            return this;
        }

        /**
         * @param userDefinedFields The rule action updates the `UserDefinedFields` field of a finding.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedFields(Map<String,String> userDefinedFields) {
            return userDefinedFields(Output.of(userDefinedFields));
        }

        /**
         * @param verificationState The rule action updates the `VerificationState` field of a finding. The allowed values are the following `UNKNOWN`, `TRUE_POSITIVE`, `FALSE_POSITIVE` and `BENIGN_POSITIVE`.
         * 
         * @return builder
         * 
         */
        public Builder verificationState(@Nullable Output<String> verificationState) {
            $.verificationState = verificationState;
            return this;
        }

        /**
         * @param verificationState The rule action updates the `VerificationState` field of a finding. The allowed values are the following `UNKNOWN`, `TRUE_POSITIVE`, `FALSE_POSITIVE` and `BENIGN_POSITIVE`.
         * 
         * @return builder
         * 
         */
        public Builder verificationState(String verificationState) {
            return verificationState(Output.of(verificationState));
        }

        /**
         * @param workflow A resource block that is used to update information about the investigation into the finding. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder workflow(@Nullable Output<AutomationRuleActionFindingFieldsUpdateWorkflowArgs> workflow) {
            $.workflow = workflow;
            return this;
        }

        /**
         * @param workflow A resource block that is used to update information about the investigation into the finding. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder workflow(AutomationRuleActionFindingFieldsUpdateWorkflowArgs workflow) {
            return workflow(Output.of(workflow));
        }

        public AutomationRuleActionFindingFieldsUpdateArgs build() {
            return $;
        }
    }

}
