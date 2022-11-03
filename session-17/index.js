let marker, map;

function initMap() {
    const posicion = {
        lat: -25.363,
        lng: 131.044
    }

    const map = new google.maps.Map(document.getElementById("map"), {
        zoom: 4,
        center: posicion
    })

    const marker = new google.maps.Marker({
        position: posicion,
        map,
        title: "posisicon Inicial"
    })
    marker.setPosition(20.585002263322576, -100.38674046009503)
    marker.setCenter(20.585002263322576, -100.38674046009503)
    //geoPosicion()
}

function geoPosicion() {
    const geoLoc = navigator.geolocation
    const options = { timeout: 6000 }
    const watchPos = geoLoc.watchPosition(centraMapa, onError, options)

}

function centraMapa(position) {
    const nuevaPos = {
        lat: position.coords.latitude,
        lng: position.coords.longitude
    }
    marker.setPosition(20.585002263322576, -100.38674046009503)
    map.setCenter(nuevaPos)
}

function onError(error) {
    console.log(error)
}