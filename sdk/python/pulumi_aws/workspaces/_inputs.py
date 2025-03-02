# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'ConnectionAliasTimeoutsArgs',
    'DirectorySelfServicePermissionsArgs',
    'DirectoryWorkspaceAccessPropertiesArgs',
    'DirectoryWorkspaceCreationPropertiesArgs',
    'IpGroupRuleArgs',
    'WorkspaceWorkspacePropertiesArgs',
]

@pulumi.input_type
class ConnectionAliasTimeoutsArgs:
    def __init__(__self__, *,
                 create: Optional[pulumi.Input[str]] = None,
                 delete: Optional[pulumi.Input[str]] = None,
                 update: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] create: A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
        :param pulumi.Input[str] delete: A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
        :param pulumi.Input[str] update: A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
        """
        if create is not None:
            pulumi.set(__self__, "create", create)
        if delete is not None:
            pulumi.set(__self__, "delete", delete)
        if update is not None:
            pulumi.set(__self__, "update", update)

    @property
    @pulumi.getter
    def create(self) -> Optional[pulumi.Input[str]]:
        """
        A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
        """
        return pulumi.get(self, "create")

    @create.setter
    def create(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create", value)

    @property
    @pulumi.getter
    def delete(self) -> Optional[pulumi.Input[str]]:
        """
        A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
        """
        return pulumi.get(self, "delete")

    @delete.setter
    def delete(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delete", value)

    @property
    @pulumi.getter
    def update(self) -> Optional[pulumi.Input[str]]:
        """
        A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
        """
        return pulumi.get(self, "update")

    @update.setter
    def update(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "update", value)


@pulumi.input_type
class DirectorySelfServicePermissionsArgs:
    def __init__(__self__, *,
                 change_compute_type: Optional[pulumi.Input[bool]] = None,
                 increase_volume_size: Optional[pulumi.Input[bool]] = None,
                 rebuild_workspace: Optional[pulumi.Input[bool]] = None,
                 restart_workspace: Optional[pulumi.Input[bool]] = None,
                 switch_running_mode: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[bool] change_compute_type: Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
        :param pulumi.Input[bool] increase_volume_size: Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
        :param pulumi.Input[bool] rebuild_workspace: Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
        :param pulumi.Input[bool] restart_workspace: Whether WorkSpaces directory users can restart their workspace. Default `true`.
        :param pulumi.Input[bool] switch_running_mode: Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
        """
        if change_compute_type is not None:
            pulumi.set(__self__, "change_compute_type", change_compute_type)
        if increase_volume_size is not None:
            pulumi.set(__self__, "increase_volume_size", increase_volume_size)
        if rebuild_workspace is not None:
            pulumi.set(__self__, "rebuild_workspace", rebuild_workspace)
        if restart_workspace is not None:
            pulumi.set(__self__, "restart_workspace", restart_workspace)
        if switch_running_mode is not None:
            pulumi.set(__self__, "switch_running_mode", switch_running_mode)

    @property
    @pulumi.getter(name="changeComputeType")
    def change_compute_type(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
        """
        return pulumi.get(self, "change_compute_type")

    @change_compute_type.setter
    def change_compute_type(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "change_compute_type", value)

    @property
    @pulumi.getter(name="increaseVolumeSize")
    def increase_volume_size(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
        """
        return pulumi.get(self, "increase_volume_size")

    @increase_volume_size.setter
    def increase_volume_size(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "increase_volume_size", value)

    @property
    @pulumi.getter(name="rebuildWorkspace")
    def rebuild_workspace(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
        """
        return pulumi.get(self, "rebuild_workspace")

    @rebuild_workspace.setter
    def rebuild_workspace(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "rebuild_workspace", value)

    @property
    @pulumi.getter(name="restartWorkspace")
    def restart_workspace(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether WorkSpaces directory users can restart their workspace. Default `true`.
        """
        return pulumi.get(self, "restart_workspace")

    @restart_workspace.setter
    def restart_workspace(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "restart_workspace", value)

    @property
    @pulumi.getter(name="switchRunningMode")
    def switch_running_mode(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
        """
        return pulumi.get(self, "switch_running_mode")

    @switch_running_mode.setter
    def switch_running_mode(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "switch_running_mode", value)


@pulumi.input_type
class DirectoryWorkspaceAccessPropertiesArgs:
    def __init__(__self__, *,
                 device_type_android: Optional[pulumi.Input[str]] = None,
                 device_type_chromeos: Optional[pulumi.Input[str]] = None,
                 device_type_ios: Optional[pulumi.Input[str]] = None,
                 device_type_linux: Optional[pulumi.Input[str]] = None,
                 device_type_osx: Optional[pulumi.Input[str]] = None,
                 device_type_web: Optional[pulumi.Input[str]] = None,
                 device_type_windows: Optional[pulumi.Input[str]] = None,
                 device_type_zeroclient: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] device_type_android: Indicates whether users can use Android devices to access their WorkSpaces.
        :param pulumi.Input[str] device_type_chromeos: Indicates whether users can use Chromebooks to access their WorkSpaces.
        :param pulumi.Input[str] device_type_ios: Indicates whether users can use iOS devices to access their WorkSpaces.
        :param pulumi.Input[str] device_type_linux: Indicates whether users can use Linux clients to access their WorkSpaces.
        :param pulumi.Input[str] device_type_osx: Indicates whether users can use macOS clients to access their WorkSpaces.
        :param pulumi.Input[str] device_type_web: Indicates whether users can access their WorkSpaces through a web browser.
        :param pulumi.Input[str] device_type_windows: Indicates whether users can use Windows clients to access their WorkSpaces.
        :param pulumi.Input[str] device_type_zeroclient: Indicates whether users can use zero client devices to access their WorkSpaces.
        """
        if device_type_android is not None:
            pulumi.set(__self__, "device_type_android", device_type_android)
        if device_type_chromeos is not None:
            pulumi.set(__self__, "device_type_chromeos", device_type_chromeos)
        if device_type_ios is not None:
            pulumi.set(__self__, "device_type_ios", device_type_ios)
        if device_type_linux is not None:
            pulumi.set(__self__, "device_type_linux", device_type_linux)
        if device_type_osx is not None:
            pulumi.set(__self__, "device_type_osx", device_type_osx)
        if device_type_web is not None:
            pulumi.set(__self__, "device_type_web", device_type_web)
        if device_type_windows is not None:
            pulumi.set(__self__, "device_type_windows", device_type_windows)
        if device_type_zeroclient is not None:
            pulumi.set(__self__, "device_type_zeroclient", device_type_zeroclient)

    @property
    @pulumi.getter(name="deviceTypeAndroid")
    def device_type_android(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether users can use Android devices to access their WorkSpaces.
        """
        return pulumi.get(self, "device_type_android")

    @device_type_android.setter
    def device_type_android(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_type_android", value)

    @property
    @pulumi.getter(name="deviceTypeChromeos")
    def device_type_chromeos(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether users can use Chromebooks to access their WorkSpaces.
        """
        return pulumi.get(self, "device_type_chromeos")

    @device_type_chromeos.setter
    def device_type_chromeos(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_type_chromeos", value)

    @property
    @pulumi.getter(name="deviceTypeIos")
    def device_type_ios(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether users can use iOS devices to access their WorkSpaces.
        """
        return pulumi.get(self, "device_type_ios")

    @device_type_ios.setter
    def device_type_ios(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_type_ios", value)

    @property
    @pulumi.getter(name="deviceTypeLinux")
    def device_type_linux(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether users can use Linux clients to access their WorkSpaces.
        """
        return pulumi.get(self, "device_type_linux")

    @device_type_linux.setter
    def device_type_linux(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_type_linux", value)

    @property
    @pulumi.getter(name="deviceTypeOsx")
    def device_type_osx(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether users can use macOS clients to access their WorkSpaces.
        """
        return pulumi.get(self, "device_type_osx")

    @device_type_osx.setter
    def device_type_osx(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_type_osx", value)

    @property
    @pulumi.getter(name="deviceTypeWeb")
    def device_type_web(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether users can access their WorkSpaces through a web browser.
        """
        return pulumi.get(self, "device_type_web")

    @device_type_web.setter
    def device_type_web(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_type_web", value)

    @property
    @pulumi.getter(name="deviceTypeWindows")
    def device_type_windows(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether users can use Windows clients to access their WorkSpaces.
        """
        return pulumi.get(self, "device_type_windows")

    @device_type_windows.setter
    def device_type_windows(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_type_windows", value)

    @property
    @pulumi.getter(name="deviceTypeZeroclient")
    def device_type_zeroclient(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether users can use zero client devices to access their WorkSpaces.
        """
        return pulumi.get(self, "device_type_zeroclient")

    @device_type_zeroclient.setter
    def device_type_zeroclient(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_type_zeroclient", value)


@pulumi.input_type
class DirectoryWorkspaceCreationPropertiesArgs:
    def __init__(__self__, *,
                 custom_security_group_id: Optional[pulumi.Input[str]] = None,
                 default_ou: Optional[pulumi.Input[str]] = None,
                 enable_internet_access: Optional[pulumi.Input[bool]] = None,
                 enable_maintenance_mode: Optional[pulumi.Input[bool]] = None,
                 user_enabled_as_local_administrator: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[str] custom_security_group_id: The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
        :param pulumi.Input[str] default_ou: The default organizational unit (OU) for your WorkSpace directories. Should conform `"OU=<value>,DC=<value>,...,DC=<value>"` pattern.
        :param pulumi.Input[bool] enable_internet_access: Indicates whether internet access is enabled for your WorkSpaces.
        :param pulumi.Input[bool] enable_maintenance_mode: Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html)..
        :param pulumi.Input[bool] user_enabled_as_local_administrator: Indicates whether users are local administrators of their WorkSpaces.
        """
        if custom_security_group_id is not None:
            pulumi.set(__self__, "custom_security_group_id", custom_security_group_id)
        if default_ou is not None:
            pulumi.set(__self__, "default_ou", default_ou)
        if enable_internet_access is not None:
            pulumi.set(__self__, "enable_internet_access", enable_internet_access)
        if enable_maintenance_mode is not None:
            pulumi.set(__self__, "enable_maintenance_mode", enable_maintenance_mode)
        if user_enabled_as_local_administrator is not None:
            pulumi.set(__self__, "user_enabled_as_local_administrator", user_enabled_as_local_administrator)

    @property
    @pulumi.getter(name="customSecurityGroupId")
    def custom_security_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
        """
        return pulumi.get(self, "custom_security_group_id")

    @custom_security_group_id.setter
    def custom_security_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_security_group_id", value)

    @property
    @pulumi.getter(name="defaultOu")
    def default_ou(self) -> Optional[pulumi.Input[str]]:
        """
        The default organizational unit (OU) for your WorkSpace directories. Should conform `"OU=<value>,DC=<value>,...,DC=<value>"` pattern.
        """
        return pulumi.get(self, "default_ou")

    @default_ou.setter
    def default_ou(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_ou", value)

    @property
    @pulumi.getter(name="enableInternetAccess")
    def enable_internet_access(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether internet access is enabled for your WorkSpaces.
        """
        return pulumi.get(self, "enable_internet_access")

    @enable_internet_access.setter
    def enable_internet_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_internet_access", value)

    @property
    @pulumi.getter(name="enableMaintenanceMode")
    def enable_maintenance_mode(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html)..
        """
        return pulumi.get(self, "enable_maintenance_mode")

    @enable_maintenance_mode.setter
    def enable_maintenance_mode(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_maintenance_mode", value)

    @property
    @pulumi.getter(name="userEnabledAsLocalAdministrator")
    def user_enabled_as_local_administrator(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether users are local administrators of their WorkSpaces.
        """
        return pulumi.get(self, "user_enabled_as_local_administrator")

    @user_enabled_as_local_administrator.setter
    def user_enabled_as_local_administrator(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "user_enabled_as_local_administrator", value)


@pulumi.input_type
class IpGroupRuleArgs:
    def __init__(__self__, *,
                 source: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] source: The IP address range, in CIDR notation, e.g., `10.0.0.0/16`
        :param pulumi.Input[str] description: The description of the IP group.
        """
        pulumi.set(__self__, "source", source)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def source(self) -> pulumi.Input[str]:
        """
        The IP address range, in CIDR notation, e.g., `10.0.0.0/16`
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: pulumi.Input[str]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the IP group.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class WorkspaceWorkspacePropertiesArgs:
    def __init__(__self__, *,
                 compute_type_name: Optional[pulumi.Input[str]] = None,
                 root_volume_size_gib: Optional[pulumi.Input[int]] = None,
                 running_mode: Optional[pulumi.Input[str]] = None,
                 running_mode_auto_stop_timeout_in_minutes: Optional[pulumi.Input[int]] = None,
                 user_volume_size_gib: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[str] compute_type_name: The compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO`, `GRAPHICSPRO`, `GRAPHICS_G4DN`, and `GRAPHICSPRO_G4DN`.
        :param pulumi.Input[int] root_volume_size_gib: The size of the root volume.
        :param pulumi.Input[str] running_mode: The running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
        :param pulumi.Input[int] running_mode_auto_stop_timeout_in_minutes: The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
        :param pulumi.Input[int] user_volume_size_gib: The size of the user storage.
        """
        if compute_type_name is not None:
            pulumi.set(__self__, "compute_type_name", compute_type_name)
        if root_volume_size_gib is not None:
            pulumi.set(__self__, "root_volume_size_gib", root_volume_size_gib)
        if running_mode is not None:
            pulumi.set(__self__, "running_mode", running_mode)
        if running_mode_auto_stop_timeout_in_minutes is not None:
            pulumi.set(__self__, "running_mode_auto_stop_timeout_in_minutes", running_mode_auto_stop_timeout_in_minutes)
        if user_volume_size_gib is not None:
            pulumi.set(__self__, "user_volume_size_gib", user_volume_size_gib)

    @property
    @pulumi.getter(name="computeTypeName")
    def compute_type_name(self) -> Optional[pulumi.Input[str]]:
        """
        The compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO`, `GRAPHICSPRO`, `GRAPHICS_G4DN`, and `GRAPHICSPRO_G4DN`.
        """
        return pulumi.get(self, "compute_type_name")

    @compute_type_name.setter
    def compute_type_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compute_type_name", value)

    @property
    @pulumi.getter(name="rootVolumeSizeGib")
    def root_volume_size_gib(self) -> Optional[pulumi.Input[int]]:
        """
        The size of the root volume.
        """
        return pulumi.get(self, "root_volume_size_gib")

    @root_volume_size_gib.setter
    def root_volume_size_gib(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "root_volume_size_gib", value)

    @property
    @pulumi.getter(name="runningMode")
    def running_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
        """
        return pulumi.get(self, "running_mode")

    @running_mode.setter
    def running_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "running_mode", value)

    @property
    @pulumi.getter(name="runningModeAutoStopTimeoutInMinutes")
    def running_mode_auto_stop_timeout_in_minutes(self) -> Optional[pulumi.Input[int]]:
        """
        The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
        """
        return pulumi.get(self, "running_mode_auto_stop_timeout_in_minutes")

    @running_mode_auto_stop_timeout_in_minutes.setter
    def running_mode_auto_stop_timeout_in_minutes(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "running_mode_auto_stop_timeout_in_minutes", value)

    @property
    @pulumi.getter(name="userVolumeSizeGib")
    def user_volume_size_gib(self) -> Optional[pulumi.Input[int]]:
        """
        The size of the user storage.
        """
        return pulumi.get(self, "user_volume_size_gib")

    @user_volume_size_gib.setter
    def user_volume_size_gib(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "user_volume_size_gib", value)


