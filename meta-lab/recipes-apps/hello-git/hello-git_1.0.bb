#
# This file is the hello-git recipe.
#

SUMMARY = "Simple myapp application"
SECTION = "example"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRCREV = "b18103ceaff54924407e19896606ed29b949fbb6"
SRC_URI = "git://github.com/embedig/${BPN}.git;branch=main;protocol=https \
           file://hello-git-modify.patch"

S = "${WORKDIR}/git"

do_compile() {
	     oe_runmake
}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 hello-git ${D}${bindir}
}
