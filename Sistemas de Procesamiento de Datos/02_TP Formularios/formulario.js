document.addEventListener('DOMContentLoaded', () => {
	// eslint-disable-next-line func-names
	document.querySelector('form').addEventListener('submit', function (e) {
		e.preventDefault();

		const formData = new FormData(this);
		const formDataObject = {};

		// Recopilar datos de los campos de idiomas y niveles
		const idiomas = [];
		const idiomaCheckboxes = document.querySelectorAll(
			'input[type="checkbox"][name$="es"]'
		);
		const nivelRanges = document.querySelectorAll(
			'input[type="range"][name^="nivel"]'
		);

		idiomaCheckboxes.forEach((checkbox, index) => {
			if (checkbox.checked) {
				const idioma = checkbox.name;
				const nivel = nivelRanges[index].value;
				idiomas.push({ idioma, nivel });
			}
		});

		formDataObject.idiomas = idiomas;

		// Resto de los datos del formulario
		formData.forEach((value, key) => {
			formDataObject[key] = value;
		});

		console.log(formDataObject);
	});
});
