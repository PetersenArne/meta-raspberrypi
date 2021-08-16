LINUX_VERSION ?= "5.10.52"
LINUX_RPI_BRANCH ?= "rpi-5.10.52-rt"
LINUX_RPI_KMETA_BRANCH ?= "yocto-5.10"

SRCREV_machine = "9a95d4bfeaebae719ecad7dafd38ead74dbb43f8"
SRCREV_meta = "a19886b00ea7d874fdd60d8e3435894bb16e6434"

KMETA = "kernel-meta"

SRC_URI = " \
    git://github.com/PetersenArne/linux_fork_5.10.x_rpi_rt.git;name=machine;branch=${LINUX_RPI_BRANCH} \
    git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=${LINUX_RPI_KMETA_BRANCH};destsuffix=${KMETA} \
    file://powersave.cfg \
    file://android-drivers.cfg \
    "

require linux-raspberrypi.inc

KERNEL_DTC_FLAGS += "-@ -H epapr"
