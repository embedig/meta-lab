SUMMARY = "Recipe for  build an external mymodule Linux kernel module"
SECTION = "PETALINUX/modules"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit module

INHIBIT_PACKAGE_STRIP = "1"

SRCREV = "05b6cc56eb0d8e2fc5db92fec2c76f7b29f5f9fb"
SRC_URI = "git://github.com/embedig/${BPN}.git;branch=main;protocol=https"

S = "${WORKDIR}/git"

KERNEL_MODULE_AUTOLOAD += "mymodule"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
