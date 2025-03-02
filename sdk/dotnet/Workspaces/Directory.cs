// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Workspaces
{
    /// <summary>
    /// Provides a WorkSpaces directory in AWS WorkSpaces Service.
    /// 
    /// &gt; **NOTE:** AWS WorkSpaces service requires [`workspaces_DefaultRole`](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role) IAM role to operate normally.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleVpc = new Aws.Ec2.Vpc("example", new()
    ///     {
    ///         CidrBlock = "10.0.0.0/16",
    ///     });
    /// 
    ///     var exampleA = new Aws.Ec2.Subnet("example_a", new()
    ///     {
    ///         VpcId = exampleVpc.Id,
    ///         AvailabilityZone = "us-east-1a",
    ///         CidrBlock = "10.0.0.0/24",
    ///     });
    /// 
    ///     var exampleB = new Aws.Ec2.Subnet("example_b", new()
    ///     {
    ///         VpcId = exampleVpc.Id,
    ///         AvailabilityZone = "us-east-1b",
    ///         CidrBlock = "10.0.1.0/24",
    ///     });
    /// 
    ///     var exampleDirectory = new Aws.DirectoryService.Directory("example", new()
    ///     {
    ///         Name = "corp.example.com",
    ///         Password = "#S1ncerely",
    ///         Size = "Small",
    ///         VpcSettings = new Aws.DirectoryService.Inputs.DirectoryVpcSettingsArgs
    ///         {
    ///             VpcId = exampleVpc.Id,
    ///             SubnetIds = new[]
    ///             {
    ///                 exampleA.Id,
    ///                 exampleB.Id,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleC = new Aws.Ec2.Subnet("example_c", new()
    ///     {
    ///         VpcId = exampleVpc.Id,
    ///         AvailabilityZone = "us-east-1c",
    ///         CidrBlock = "10.0.2.0/24",
    ///     });
    /// 
    ///     var exampleD = new Aws.Ec2.Subnet("example_d", new()
    ///     {
    ///         VpcId = exampleVpc.Id,
    ///         AvailabilityZone = "us-east-1d",
    ///         CidrBlock = "10.0.3.0/24",
    ///     });
    /// 
    ///     var example = new Aws.Workspaces.Directory("example", new()
    ///     {
    ///         DirectoryId = exampleDirectory.Id,
    ///         SubnetIds = new[]
    ///         {
    ///             exampleC.Id,
    ///             exampleD.Id,
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Example", "true" },
    ///         },
    ///         SelfServicePermissions = new Aws.Workspaces.Inputs.DirectorySelfServicePermissionsArgs
    ///         {
    ///             ChangeComputeType = true,
    ///             IncreaseVolumeSize = true,
    ///             RebuildWorkspace = true,
    ///             RestartWorkspace = true,
    ///             SwitchRunningMode = true,
    ///         },
    ///         WorkspaceAccessProperties = new Aws.Workspaces.Inputs.DirectoryWorkspaceAccessPropertiesArgs
    ///         {
    ///             DeviceTypeAndroid = "ALLOW",
    ///             DeviceTypeChromeos = "ALLOW",
    ///             DeviceTypeIos = "ALLOW",
    ///             DeviceTypeLinux = "DENY",
    ///             DeviceTypeOsx = "ALLOW",
    ///             DeviceTypeWeb = "DENY",
    ///             DeviceTypeWindows = "DENY",
    ///             DeviceTypeZeroclient = "DENY",
    ///         },
    ///         WorkspaceCreationProperties = new Aws.Workspaces.Inputs.DirectoryWorkspaceCreationPropertiesArgs
    ///         {
    ///             CustomSecurityGroupId = exampleAwsSecurityGroup.Id,
    ///             DefaultOu = "OU=AWS,DC=Workgroup,DC=Example,DC=com",
    ///             EnableInternetAccess = true,
    ///             EnableMaintenanceMode = true,
    ///             UserEnabledAsLocalAdministrator = true,
    ///         },
    ///     });
    /// 
    ///     var workspaces = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Actions = new[]
    ///                 {
    ///                     "sts:AssumeRole",
    ///                 },
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "workspaces.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var workspacesDefault = new Aws.Iam.Role("workspaces_default", new()
    ///     {
    ///         Name = "workspaces_DefaultRole",
    ///         AssumeRolePolicy = workspaces.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var workspacesDefaultServiceAccess = new Aws.Iam.RolePolicyAttachment("workspaces_default_service_access", new()
    ///     {
    ///         Role = workspacesDefault.Name,
    ///         PolicyArn = "arn:aws:iam::aws:policy/AmazonWorkSpacesServiceAccess",
    ///     });
    /// 
    ///     var workspacesDefaultSelfServiceAccess = new Aws.Iam.RolePolicyAttachment("workspaces_default_self_service_access", new()
    ///     {
    ///         Role = workspacesDefault.Name,
    ///         PolicyArn = "arn:aws:iam::aws:policy/AmazonWorkSpacesSelfServiceAccess",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### IP Groups
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleIpGroup = new Aws.Workspaces.IpGroup("example", new()
    ///     {
    ///         Name = "example",
    ///     });
    /// 
    ///     var example = new Aws.Workspaces.Directory("example", new()
    ///     {
    ///         DirectoryId = exampleAwsDirectoryServiceDirectory.Id,
    ///         IpGroupIds = new[]
    ///         {
    ///             exampleIpGroup.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Workspaces directory using the directory ID. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:workspaces/directory:Directory main d-4444444444
    /// ```
    /// </summary>
    [AwsResourceType("aws:workspaces/directory:Directory")]
    public partial class Directory : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The directory alias.
        /// </summary>
        [Output("alias")]
        public Output<string> Alias { get; private set; } = null!;

        /// <summary>
        /// The user name for the service account.
        /// </summary>
        [Output("customerUserName")]
        public Output<string> CustomerUserName { get; private set; } = null!;

        /// <summary>
        /// The directory identifier for registration in WorkSpaces service.
        /// </summary>
        [Output("directoryId")]
        public Output<string> DirectoryId { get; private set; } = null!;

        /// <summary>
        /// The name of the directory.
        /// </summary>
        [Output("directoryName")]
        public Output<string> DirectoryName { get; private set; } = null!;

        /// <summary>
        /// The directory type.
        /// </summary>
        [Output("directoryType")]
        public Output<string> DirectoryType { get; private set; } = null!;

        /// <summary>
        /// The IP addresses of the DNS servers for the directory.
        /// </summary>
        [Output("dnsIpAddresses")]
        public Output<ImmutableArray<string>> DnsIpAddresses { get; private set; } = null!;

        /// <summary>
        /// The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
        /// </summary>
        [Output("iamRoleId")]
        public Output<string> IamRoleId { get; private set; } = null!;

        /// <summary>
        /// The identifiers of the IP access control groups associated with the directory.
        /// </summary>
        [Output("ipGroupIds")]
        public Output<ImmutableArray<string>> IpGroupIds { get; private set; } = null!;

        /// <summary>
        /// The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
        /// </summary>
        [Output("registrationCode")]
        public Output<string> RegistrationCode { get; private set; } = null!;

        /// <summary>
        /// Permissions to enable or disable self-service capabilities. Defined below.
        /// </summary>
        [Output("selfServicePermissions")]
        public Output<Outputs.DirectorySelfServicePermissions> SelfServicePermissions { get; private set; } = null!;

        /// <summary>
        /// The identifiers of the subnets where the directory resides.
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the WorkSpaces directory. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
        /// </summary>
        [Output("workspaceAccessProperties")]
        public Output<Outputs.DirectoryWorkspaceAccessProperties> WorkspaceAccessProperties { get; private set; } = null!;

        /// <summary>
        /// Default properties that are used for creating WorkSpaces. Defined below.
        /// </summary>
        [Output("workspaceCreationProperties")]
        public Output<Outputs.DirectoryWorkspaceCreationProperties> WorkspaceCreationProperties { get; private set; } = null!;

        /// <summary>
        /// The identifier of the security group that is assigned to new WorkSpaces.
        /// </summary>
        [Output("workspaceSecurityGroupId")]
        public Output<string> WorkspaceSecurityGroupId { get; private set; } = null!;


        /// <summary>
        /// Create a Directory resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Directory(string name, DirectoryArgs args, CustomResourceOptions? options = null)
            : base("aws:workspaces/directory:Directory", name, args ?? new DirectoryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Directory(string name, Input<string> id, DirectoryState? state = null, CustomResourceOptions? options = null)
            : base("aws:workspaces/directory:Directory", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Directory resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Directory Get(string name, Input<string> id, DirectoryState? state = null, CustomResourceOptions? options = null)
        {
            return new Directory(name, id, state, options);
        }
    }

    public sealed class DirectoryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The directory identifier for registration in WorkSpaces service.
        /// </summary>
        [Input("directoryId", required: true)]
        public Input<string> DirectoryId { get; set; } = null!;

        [Input("ipGroupIds")]
        private InputList<string>? _ipGroupIds;

        /// <summary>
        /// The identifiers of the IP access control groups associated with the directory.
        /// </summary>
        public InputList<string> IpGroupIds
        {
            get => _ipGroupIds ?? (_ipGroupIds = new InputList<string>());
            set => _ipGroupIds = value;
        }

        /// <summary>
        /// Permissions to enable or disable self-service capabilities. Defined below.
        /// </summary>
        [Input("selfServicePermissions")]
        public Input<Inputs.DirectorySelfServicePermissionsArgs>? SelfServicePermissions { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// The identifiers of the subnets where the directory resides.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags assigned to the WorkSpaces directory. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
        /// </summary>
        [Input("workspaceAccessProperties")]
        public Input<Inputs.DirectoryWorkspaceAccessPropertiesArgs>? WorkspaceAccessProperties { get; set; }

        /// <summary>
        /// Default properties that are used for creating WorkSpaces. Defined below.
        /// </summary>
        [Input("workspaceCreationProperties")]
        public Input<Inputs.DirectoryWorkspaceCreationPropertiesArgs>? WorkspaceCreationProperties { get; set; }

        public DirectoryArgs()
        {
        }
        public static new DirectoryArgs Empty => new DirectoryArgs();
    }

    public sealed class DirectoryState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The directory alias.
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        /// <summary>
        /// The user name for the service account.
        /// </summary>
        [Input("customerUserName")]
        public Input<string>? CustomerUserName { get; set; }

        /// <summary>
        /// The directory identifier for registration in WorkSpaces service.
        /// </summary>
        [Input("directoryId")]
        public Input<string>? DirectoryId { get; set; }

        /// <summary>
        /// The name of the directory.
        /// </summary>
        [Input("directoryName")]
        public Input<string>? DirectoryName { get; set; }

        /// <summary>
        /// The directory type.
        /// </summary>
        [Input("directoryType")]
        public Input<string>? DirectoryType { get; set; }

        [Input("dnsIpAddresses")]
        private InputList<string>? _dnsIpAddresses;

        /// <summary>
        /// The IP addresses of the DNS servers for the directory.
        /// </summary>
        public InputList<string> DnsIpAddresses
        {
            get => _dnsIpAddresses ?? (_dnsIpAddresses = new InputList<string>());
            set => _dnsIpAddresses = value;
        }

        /// <summary>
        /// The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
        /// </summary>
        [Input("iamRoleId")]
        public Input<string>? IamRoleId { get; set; }

        [Input("ipGroupIds")]
        private InputList<string>? _ipGroupIds;

        /// <summary>
        /// The identifiers of the IP access control groups associated with the directory.
        /// </summary>
        public InputList<string> IpGroupIds
        {
            get => _ipGroupIds ?? (_ipGroupIds = new InputList<string>());
            set => _ipGroupIds = value;
        }

        /// <summary>
        /// The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
        /// </summary>
        [Input("registrationCode")]
        public Input<string>? RegistrationCode { get; set; }

        /// <summary>
        /// Permissions to enable or disable self-service capabilities. Defined below.
        /// </summary>
        [Input("selfServicePermissions")]
        public Input<Inputs.DirectorySelfServicePermissionsGetArgs>? SelfServicePermissions { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// The identifiers of the subnets where the directory resides.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags assigned to the WorkSpaces directory. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
        /// </summary>
        [Input("workspaceAccessProperties")]
        public Input<Inputs.DirectoryWorkspaceAccessPropertiesGetArgs>? WorkspaceAccessProperties { get; set; }

        /// <summary>
        /// Default properties that are used for creating WorkSpaces. Defined below.
        /// </summary>
        [Input("workspaceCreationProperties")]
        public Input<Inputs.DirectoryWorkspaceCreationPropertiesGetArgs>? WorkspaceCreationProperties { get; set; }

        /// <summary>
        /// The identifier of the security group that is assigned to new WorkSpaces.
        /// </summary>
        [Input("workspaceSecurityGroupId")]
        public Input<string>? WorkspaceSecurityGroupId { get; set; }

        public DirectoryState()
        {
        }
        public static new DirectoryState Empty => new DirectoryState();
    }
}
