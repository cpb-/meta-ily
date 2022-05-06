SUMMARY = "My custom application"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI += "file://custom-app-${PV}.tar.bz2"
SRC_URI += "file://run-custom-app"

S = "${WORKDIR}/${BPN}"

do_compile() {
	oe_runmake
}

inherit update-rc.d
INITSCRIPT_NAME = "run-custom-app"
INITSCRIPT_PARAMS = "start 90 2 3 4 5 ."

do_install() {
	install -d ${D}${bindir}
	oe_runmake DESTDIR=${D}${bindir}  install

	install -d ${D}${sysconfdir}/init.d 
	install -m 0755 ${WORKDIR}/run-custom-app ${D}${sysconfdir}/init.d/
}

