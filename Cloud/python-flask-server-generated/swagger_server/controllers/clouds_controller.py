import connexion
import six

from swagger_server.models.cloud import Cloud  # noqa: E501
from swagger_server.models.error import Error  # noqa: E501
from swagger_server import util


def cancel_cloud_by_id(cloud_id):  # noqa: E501
    """отмена заказа в облаке по id

     # noqa: E501

    :param cloud_id: идентификатор заказа в облаке
    :type cloud_id: str

    :rtype: None
    """
    return 'do some magic!'


def create_cloud():  # noqa: E501
    """Создает заказ в облаке

     # noqa: E501


    :rtype: Cloud
    """
    return 'do some magic!'


def create_order_by_id(cloud_id):  # noqa: E501
    """создание заказа по id облака

     # noqa: E501

    :param cloud_id: идентификатор облака
    :type cloud_id: str

    :rtype: None
    """
    return 'do some magic!'


def get_all_clouds():  # noqa: E501
    """Метод получение списка ресурсов на облаке

     # noqa: E501


    :rtype: Cloud
    """
    return 'do some magic!'
