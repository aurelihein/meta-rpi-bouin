DESCRIPTION = "RaspberryPi Test Packagegroup"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

COMPATIBLE_MACHINE = "^rpi$"

OMXPLAYER_rpi = "omxplayer"
OMXPLAYER_rpi_aarch64 = ""

RDEPENDS_${PN} = "\
    ${OMXPLAYER} \
    bcm2835-tests \
    rpio \
    rpi-gpio \
    pi-blaster \
    python-rtimu \
    python-sense-hat \
    crda \
    bluez5 \
"

RRECOMMENDS_${PN} = "\
    bigbuckbunny-1080p \
    ${MACHINE_EXTRA_RRECOMMENDS} \
"
