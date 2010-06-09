DESCRIPTION = "GNU m4 is an implementation of the traditional Unix macro processor."
LICENSE = "GPLv3"
SRC_URI = "${GNU_MIRROR}/m4/m4-${PV}.tar.gz \
           file://ac_config_links.patch;patch=1"
PR = "r2"

inherit autotools

EXTRA_OEMAKE += "'infodir=${infodir}'"
